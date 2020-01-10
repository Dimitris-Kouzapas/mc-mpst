package automata.machine;

import java.util.Set;
import java.util.HashSet;

import compiler.ast.base.Type;

import automata.graph.*;

import action.Action;

public class GlobalState extends State<Node> {
	private final Type type;

	public GlobalState(Type type) {
		this.type = type;
	}

	/***************************************
	 * Auxiliary
	 ***************************************/

	Set<Action> getActions() {
		return type.getActions();
	}

	private Set<String> activeRoles() {
		return type.getRoles();
	}

	/***************************************
	 * Override object methods
	 ***************************************/

	private String toString = null;

	public final String toString() {
		if(toString == null)
			toString = type.toString();
		return toString;
	}

	public final int hashCode() {
		return type.hashCode();
	}

	public final boolean equals(Object o) {
		if((o instanceof GlobalState) == false)
			return false;
		return toString().equals(((GlobalState) o).toString());
	}

	/*******************************
	 * Automata Construction
	 *******************************/

	@Override
	Node end() {
		return new EndNode().set(activeRoles());
	}

	@Override
	Node rVariable(String var) {
		return new RVariableNode(var).set(activeRoles());
	}

	@Override
	Node pass(Action action, Node next) {
		return new ActionNode(action, next).set(activeRoles());
	}

	@Override
	Node recursion(String var, Node body) {
		return new RecursionNode(var, body).set(activeRoles());
	}

	@Override
	Node union(Node node1, Node node2) {
		return node1.union(node2).set(activeRoles());
	}

	@Override
	Set<State<Node>> nextState(Action a) {
		Set<State<Node>> r = new HashSet<State<Node>>();
		Type t = type.nextState(a, new HashSet<String>());

		if(t != null)
			r.add(new GlobalState(t));

		return r;
	}
}
