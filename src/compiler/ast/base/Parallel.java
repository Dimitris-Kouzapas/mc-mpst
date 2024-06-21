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

public class Parallel extends Type {
	private final List<Type> list;

	public Parallel(List<Type> list, int line) {
		super(line);
		this.list = list;
	}

	public Parallel(int line) {
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
			stream.print(first == true ? "" : "|");
			stream.pushIndent();
			stream.printIndent(1);
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
		if(type instanceof Pass || type instanceof Recursion || type instanceof Parallel)
			return new Sum(line).union(this).union(type);

		return type.union(this);
		//if(type instanceof Sum) {
		//	for(Type t: ((Sum) type).list)
		//		list.add(t);
		//	return this;
		//}
		//else if(type instanceof Pass || type instanceof Recursion) {
		//	list.add(type);
		//	return this;
		//}
		//return type.union(this);
	}
	
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
		Parallel p = new Parallel(line);
		for(Type t: list)
			p.list.add(t.clone());

		return p;
	}

	@Override
	Type unfold() {
		Parallel p = new Parallel(line);
		for(Type t: list)
			p.list.add(t.unfold());

		return p;
	}

	@Override
	Type substitute(String var) {
		Parallel p = new Parallel(line);
		for(Type t: list)
			p.list.add(t.substitute(var));

		return p;
	}

	//TODO
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

	//TODO
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

	//Type push(Pass p) {
	//	Type type = new End(line);
	//	for(Type t: list)
	//		type = type.union(p.clone(t));
	//	return type;
	//}

	@Override
	Type branch() {
		Type type = new End(line);
		for(Type t: list) {
			Type tmp = t.branch();
			if(tmp instanceof Parallel)
				for(Type tt: ((Parallel) tmp).list)
					type = type.prod(tt);
			else
				type = type.prod(tmp);
		}
		return type;
	}

	@Override
	protected Type _project(String role) {
		Type type = new End(line);
		for(Type t: list)
			if(t.has(role))
				type = type.prod(t._project(role));

		return type;
	}
	
	@Override
	Type merge(String role, Type t, Statement stm) {
		new Exception("Fatal Error. Merge operation on parallel type").printStackTrace();
		System.exit(-1);
		return null;
	}
	
	@Override
	protected Type project(String role, Statement stm) {
		//Type type = list.get(0).project(role, stm);
		//for(int i = 1; i < list.size(); i++)
		//	type = type.merge(role, list.get(i).project(role, stm), stm);
		stm.add(projectionError("Cannot project a parallel global type.", role, stm.file()));
		return new End(line); //type;
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
				tmp = tmp.prod(t.unfolding(roles));

		return tmp;
	}

	@Override
	public Type nextState(Action a, Set<String> visited) {
		boolean activeAction = false;
		Type r = new End(line);
		for(Type t: list) {
			Type tmp = t.nextState(a, visited);
			if(tmp != null) {
				activeAction = true;
				r = r.prod(tmp);
			}
			else {
				r = r.prod(t);
			}
		}

		return (activeAction == true) ? r : null;
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
			tmp = tmp.prod(t.normalise());

		return tmp;
	}
	
	/***************************************
	 * Encoding semantics 
	 ***************************************/
	 
	@Override
	Type prod(Type type) {
		if(type instanceof Parallel) {
			for(Type t: ((Parallel) type).list)
				list.add(t);
			return this;
		}
		else if(type instanceof Pass || type instanceof Recursion || type instanceof Sum) {
			list.add(type);
			return this;
		}
		return type.prod(this);
	}

	@Override
	boolean wellConnected() { 
		boolean flag = false;
		for(Type t: list)
			flag |= wellConnected();

		return connected() && flag;
	}
	
//	boolean wellParallel() {
//		for(Type t: list)
//			if (t.connected() == false)
//				return false;
//	
//		for(Type t: list)
//			if (t.wellParallel() == false)
//				return false;
//
//		return true;
//	}

	@Override
	protected Type encodeParallel() {
		return this;
		//new Exception("Fatal Error. Encode operation on parallel type").printStackTrace();
		//System.exit(-1);
		//return null;
	}
	
	@Override
	protected List<Type> encodeParallel(List<Set<String>> connectedParticipants) {
		new Exception("Fatal Error. Encode operation on parallel type").printStackTrace();
		System.exit(-1);
		return null;
	}
}
