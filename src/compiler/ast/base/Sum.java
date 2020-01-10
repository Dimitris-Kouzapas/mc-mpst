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
//			if(first == false)
//				stream.print(" or ");
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
}
