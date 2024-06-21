package compiler.ast.base;

import java.util.Set;
import java.util.HashSet;
import java.util.List;

import compiler.ast.ASTNode;
import compiler.ast.statement.Statement;
import compiler.ast.expression.ProtocolDecl;

import automata.graph.Node;

import automata.machine.Pair;
import automata.machine.MultiState;
import automata.machine.StateMachine;

import action.Action;
import runtime.Stream;

public abstract class Type extends ASTNode {
	private static int __seq = 0;
	final int seq;

	public Type(int line) {
		super(line);
		seq = __seq++;
	}

	public abstract void semanticCheck(Statement stm);

	/***************************************
	 * Override object methods
	 ***************************************/

	@Override
	public final boolean equals(Object o) {
		return (o instanceof Type) && toString().equals(((Type) o).toString());
	}

	@Override
	public final int hashCode() {
		return toString().hashCode();
	}

	/***************************************
	 * AST Construction
	 ***************************************/

	abstract void set(String var, Recursion r);
	public abstract void set(String role);

	public abstract void set(ProtocolDecl pd);

	/***************************************
	 * Auxiliary
	 ***************************************/

	private Set<Action> actions = null;
	abstract Set<Action> actions(); 
	public final Set<Action> getActions() {
		if(actions == null)
			actions = actions();
		return actions;
	}

	private Set<String> roles = null;
	abstract Set<String> roles();
	public final Set<String> getRoles() {
		if(roles == null)
			roles = roles();

		return roles;
	}

	final boolean has(String role) {
		return getRoles().contains(role);
	}

	final boolean has(Set<String> roles) {
		for(String r: roles)
			if(getRoles().contains(r))
				return true;
		return false;
	}

	public abstract Type union(Type type);
	

	abstract Set<String> freeVar();

	/***************************************
	 * Object copy
	 ***************************************/

	@Override
	public abstract Type clone();

	abstract Type unfold();
	abstract Type substitute(String var);
	public final Type unfold(int times) {
		Type type = this.clone();
		for(int i = 0; i < times; i++)
			type = type.unfold();

		return type;
	}

	/***************************************
	 * Project
	 ***************************************/

	abstract Type branch();
	protected abstract Type _project(String role);
	final Type project(String role) {
		return branch()._project(role).dfa();
	}
	
	abstract Type merge(String role, Type t, Statement stm);
	abstract Type project(String role, Statement stm);


	/***************************************
	 * Automata translation
	 ***************************************/

	abstract List<Set<String>> independentRoles();
	abstract Type unfolding(Set<String> roles);

	//final Set<Type> unfolding() {
	//	Set<Type> r = new HashSet<Type>();
	//	List<Set<String>> list = independentRoles();
//
	//	for(Set<String> set: list)
	//		r.add(unfolding(set));
//
	//	return r;
	//}

	public abstract Type nextState(Action a, Set<String> visited);
	public abstract Set<Pair<Action, Type>> nextState(Action action);

	abstract boolean hasRVar(String var);
	public abstract Type normalise();


//	public abstract Type nextDependentState(Action a, Set<String> visited);
	/***************************************
	 * From NDFA to DFA
	 ***************************************/

	private final Type dfa() {
		return new StateMachine<Type>(new MultiState(this)).translate().normalise();
	}

	public abstract MultiState nextMultiState(Action action);

	/***************************************
	 * Encoding semantics 
	 ***************************************/

	abstract Type prod(Type t);

	abstract boolean wellConnected();

	boolean connected() {
		List<Set<String>> ir = independentRoles(); 
		return ir.size() == 1;
	}

	//abstract boolean wellParallel();

	abstract protected Type encodeParallel();
	abstract protected List<Type> encodeParallel(List<Set<String>> connectedParticipants);
}
