package compiler.ast.base;

import java.util.Set;
import java.util.HashSet;
import java.util.List;

import compiler.ast.statement.Statement;
import compiler.ast.expression.ProtocolDecl;

import automata.machine.Pair;
import automata.machine.MultiState;

import action.Action;
import runtime.Stream;

public final class Recursion extends Type {
	private final String var;
	private final Type body;

	public Recursion(String var, Type body, int line) {
		super(line);
		this.var = var;
		this.body = body;

		body.set(var, this);
	}

	@Override
	public void prettyPrint(Stream stream) {
		stream.print(var + ". ");
		body.prettyPrint(stream);
	}

	@Override
	public void semanticCheck(Statement stm) {
		body.semanticCheck(stm);
	}

	/***************************************
	 * AST Construction
	 ***************************************/

	@Override
	void set(String var, Recursion r) {
		//TODO: Is check this correct?
		if(this.var.equals(var))
			return;
		body.set(var, r);
	}

	@Override
	public void set(String role) {
		body.set(role);
	}

	@Override
	public void set(ProtocolDecl pd) {
		body.set(pd);
	}

	/***************************************
	 * Auxiliary
	 ***************************************/

	@Override
	Set<Action> actions() {
		return body.actions();
	}

	@Override
	Set<String> roles() {
		return body.roles();
	}

	@Override
	public Type union(Type type) {
		if((type instanceof Pass) || (type instanceof Recursion))
			return new Sum(line).union(this).union(type);

		return type.union(this);
//		return type.union(unfold());
	}

	/***************************************
	 * Object copy
	 ***************************************/
	private Recursion clone(Type body) {
		return new Recursion(var, body, line);
	}

	@Override
	public Recursion clone() {
		return clone(body.clone());
	}

	@Override
	Type unfold() {
		return body.substitute(var);
	}

	@Override
	Recursion substitute(String var) {
		if(this.var.equals(var))
			return clone();

		return clone(body.substitute(var));
	}

	/***************************************
	 * From NDFA to DFA
	 ***************************************/

	@Override
	public MultiState nextMultiState(Action a) {
		return body.nextMultiState(a);
	}

	/***************************************
	 * Project
	 ***************************************/

	@Override
	Type branch() {
		return clone(body.branch());
	}

	@Override
	protected Type _project(String role) {
		return has(role) ? clone(body._project(role)) : new End(line);
	}

	/***************************************
	 * Automata translation
	 ***************************************/

	@Override
	List<Set<String>> independentRoles() {
		return body.independentRoles();
	}

//	@Override
//	Type unfolding(Set<String> roles) {
//		return body.unfolding(roles);
//		Type t = body.unfolding(roles);
//		t.set(var, this);
//		return t;
//	}

	@Override
	Type unfolding(Set<String> roles) {
		return this;
	}

	final Set<Type> unfolding() {
		Set<Type> r = new HashSet<Type>();
		List<Set<String>> list = independentRoles();

		for(Set<String> set: list) {
			Type type = body.unfolding(set);
			type = type.substitute(var);
			r.add(type);
		}

		return r;
	}

	@Override
	public Type nextState(Action a, Set<String> visited) {
		if(visited.contains(toString()))
			return null;

		visited.add(toString());

		Set<Type> unf = unfolding();
		for(Type type: unf) {
			Type tmp = type.nextState(a, visited);
			if(tmp != null)
				return tmp;
		}

		return null;
	}

	@Override
	public Set<Pair<Action, Type>> nextState(Action action) {
		return unfold().nextState(action);
	}

	@Override
	boolean hasRVar(String var) {
		if(this.var.equals(var))
			return false;
		return body.hasRVar(var);
	}

	@Override
	public Type normalise() {
		return (body.hasRVar(var)) ? clone(body.normalise()) : body.normalise();
	}
}
