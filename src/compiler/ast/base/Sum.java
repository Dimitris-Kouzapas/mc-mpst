package compiler.ast.base;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

import compiler.ast.statement.Statement;
import compiler.ast.expression.ProtocolDecl;

import automata.machine.Pair;
import automata.machine.MultiState;

import action.Action;
import runtime.Stream;

public class Sum extends Type {
	private final List<Type> list;

	public Sum(List<Type> list, int line) {
		super(line);
		this.list = list;
	}

	public Sum(int line) {
		super(line);
		this.list = new ArrayList<Type>();
	}

	@Override
	public void prettyPrint(Stream stream) {
		boolean first = true;
		stream.print("(");
		stream.pushIndent();
		for(Type t: list) {
			stream.println();
			stream.println(first == true ? "choice" : "or");
			stream.pushIndent();
			t.prettyPrint(stream);
			stream.popIndent();
			first = false;
		}
		stream.popIndent();
		stream.println();
		stream.print(")");
	}

	@Override
	public void semanticCheck(Statement stm) {
		for(Type t: list)
			t.semanticCheck(stm);
	}

	/***************************************
	 * AST Construction
	 ***************************************/

	@Override
	void set(String var, Recursion r) {
		for(Type t: list)
			t.set(var, r);
	}

	@Override
	public void set(String role) {
		for(Type t: list)
			t.set(role);
	}

	@Override
	public void set(ProtocolDecl pd) {
		for(Type t: list)
			t.set(pd);
	}

	/***************************************
	 * Auxiliary
	 ***************************************/

	@Override
	Set<Action> actions() {
		Set<Action> s = new HashSet<Action>();

		for(Type t: list)
			s.addAll(t.actions());

		return s;
	}

	@Override
	Set<String> roles() {
		Set<String> s = new HashSet<String>();

		for(Type t: list)
			s.addAll(t.roles());

		return s;
	}

	@Override
	public Type union(Type type) {
		if(type instanceof Sum) {
			for(Type t: ((Sum) type).list)
				list.add(t);
			return this;
		}
		else if(type instanceof Pass || type instanceof Recursion) {
			list.add(type);
			return this;
		}
		return type.union(this);
	}

	//TODO is this fix correct
//	public Sum add(Type t) {
//		list.add(t);
//		return this;
//	}

	@Override
	Set<String> freeVar() {
		Set<String> tmp = new HashSet<String>();
		for(Type t: list)
			tmp.addAll(t.freeVar());
		return tmp;
	}

	/***************************************
	 * Object copy
	 ***************************************/

	@Override
	public Type clone() {
		Type tmp = new End(line);
		for(Type t: list)
			tmp = tmp.union(t.clone());

		return tmp;
	}

	@Override
	Type unfold() {
		Type tmp = new End(line);
		for(Type t: list)
			tmp = tmp.union(t.unfold());

		return tmp;
	}

	@Override
	Type substitute(String var) {
		Type tmp = new End(line);
		for(Type t: list)
			tmp = tmp.union(t.substitute(var));

		return tmp;
	}

	@Override
	public Set<Pair<Action, Type>> nextState(Action action) {
		Set<Pair<Action, Type>> r = new HashSet<Pair<Action, Type>>();
		for(Type t: list)
			r.addAll(t.nextState(action));

		return r;
	}

	/***************************************
	 * From NDFA to DFA
	 ***************************************/

	@Override
	public MultiState nextMultiState(Action a) {
		MultiState state = new MultiState();
		for(Type t: list)
			state.add(t.nextMultiState(a));
		return state;
	}

	/***************************************
	 * Project
	 ***************************************/

	Type push(Pass p) {
		Type type = new End(line);
		for(Type t: list)
			type = type.union(p.clone(t));
		return type;
	}

	@Override
	Type branch() {
		Type type = new End(line);
		for(Type t: list) {
			Type tmp = t.branch();
			if(tmp instanceof Sum)
				for(Type tt: ((Sum) tmp).list)
					type = type.union(tt);
			else
				type = type.union(tmp);
		}
		return type;
	}

	@Override
	protected Type _project(String role) {
		Type type = new End(line);
		for(Type t: list)
			if(t.has(role))
				type = type.union(t._project(role));

		return type;
	}
	
	@Override
	Type merge(String role, Type t, Statement stm) {
		ArrayList<Type> list1= new ArrayList<Type>();
		ArrayList<Type> list2 = new ArrayList<Type>();
		
		if (t instanceof Sum)
			for(Type l: ((Sum)t).list)
				list1.add(l);
		else 
			list1.add(t);
	
		for (Type l: list)
			list2.add(l);

		Sum s = new Sum(line);
		for(int i = 0; i < list1.size(); i++) {
			boolean merged = false;
			for(int j = 0; j < list2.size(); j++) {
				Type tmp = list1.get(i).merge(role, list2.get(j), stm);
				if ((tmp instanceof Sum) == false) {
					s.list.add(tmp);
					merged = true;
					list2.remove(j);
					break;
				}
			}
			if (merged == false)
				s.list.add(list1.get(i));
		}
		for (Type l: list2)
			s.list.add(l);

		return s;
	}
	
	@Override
	protected Type project(String role, Statement stm) {
		Type type = list.get(0).project(role, stm);
		for(int i = 1; i < list.size(); i++)
			type = type.merge(role, list.get(i).project(role, stm), stm);

		return type;
	}

	/***************************************
	 * Automata translation
	 ***************************************/

	private static boolean commonElements(Set<String> set1, Set<String> set2) {
		for(String s: set1)
			if(set2.contains(s))
				return true;

		return false;
	}

	@Override
	List<Set<String>> independentRoles() {
		List<Set<String>> r = new ArrayList<Set<String>>();

		outer:
		for(Type t: list) {
			List<Set<String>> tmp = t.independentRoles();

			for(Set<String> set2: tmp) {
				boolean flag = false;
				for(Set<String> set1: r)
					if(commonElements(set1, set2)) {
						set1.addAll(set2);
						flag = true;
						continue outer;
					}
				if(flag == false)
					r.add(set2);
			}
		}
		return r;
	}

	@Override
	Type unfolding(Set<String> roles) {
		Type tmp = new End(line);
		for(Type t: list)
			if(t.has(roles))
				tmp = tmp.union(t.unfolding(roles));

		return tmp;
	}

	@Override
	public Type nextState(Action a, Set<String> visited) {
		Type r = null;
		for(Type t: list) {
			Type tmp = t.nextState(a, visited);
			if(tmp != null) {
				if(r == null)
					r = new End(line);
				r = r.union(tmp);
			}
		}

		return r;
	}

	@Override
	boolean hasRVar(String var) {
		for(Type t: list)
			if(t.hasRVar(var))
				return true;
		return false;
	}

	@Override
	public Type normalise() {
		Type tmp = new End(line);
		for(Type t: list)
			tmp = tmp.union(t.normalise());

		return tmp;
	}
	
	/***************************************
	 * Encoding semantics 
	 ***************************************/
	@Override
	Type prod(Type type) {
		if(type instanceof Pass || type instanceof Recursion || type instanceof Sum)
			return new Parallel(line).prod(this).prod(type);

		return type.prod(this);
	}

	@Override
	boolean wellConnected() { 
		boolean flag = true;
		for(Type t: list)
			flag &= t.wellConnected();

		return connected() && flag;
	}
	
//	@Override
//	boolean wellParallel() {
//		for(Type t: list)
//			if (t.wellParallel() == false)
//				return false;
//		return true;
//	}

	@Override
	protected Type encodeParallel() {
		Type tmp = new End(line);
		for(Type t: list)
			tmp = tmp.union(t.encodeParallel());

		return tmp;
	}

	@Override
	protected List<Type> encodeParallel(List<Set<String>> connectedParticipants) {
		List<List<Type>> branchList = new ArrayList<List<Type>>();
		int subsets = 0;
		int subsets2 = 0;
		for(Type t: list) {
			List<Set<String>> ir = t.independentRoles();
			for(Set<String> s1: ir) {
				loop:
				for(Set<String> s2: connectedParticipants) {
					for (String r1: s1) {
						if(s2.contains(r1) == false) {
							continue loop;
						}
					}

					for (String r2: s2) {
						if(s1.contains(r2) == false) {
							continue loop;
						}
					}
					subsets++;
					break;
				}
			}
			if (subsets == ir.size()) {
				subsets2++;
			}
			subsets = 0;
		}


		if(subsets2 != list.size()) {
			return null;
		}
		

		for(Type t: list) {
			List<Type> tmp = t.encodeParallel(connectedParticipants);
			if(tmp == null)
				return null; 
			branchList.add(tmp);
		}

		//System.out.println(branchList);

		int diff = 0;
		int diffIndex = 0;
		for(int i = 0; i < branchList.size(); i++) {
			List<Type> ipList1 = branchList.get(i);
			for(int j = i + 1; j < branchList.size(); j++) {
				List<Type> ipList2 = branchList.get(j);
				for(int k = 0; k < connectedParticipants.size(); k++)
					if(ipList1.get(k).toString().equals(ipList2.get(k).toString()) == false) {
						diff++;
						diffIndex = k;
					}
			}
		}

		//System.out.println(diff + " " + diffIndex);
		//for(List<Type> ipList: branchList)
		//	System.out.println(ipList.get(diffIndex));

		if (diff == 0)
			return branchList.get(0);
		else if (diff == 1) {
			Type tmpType = new End(line);
			for(List<Type> ipList: branchList)
				tmpType = tmpType.union(ipList.get(diffIndex));
			branchList.get(0).remove(diffIndex);
			branchList.get(0).add(diffIndex, tmpType);
			return branchList.get(0);
		}
		return null;
	}
}
