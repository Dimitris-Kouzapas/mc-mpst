package automata.machine;

import java.util.Set;
import java.util.HashSet;

import compiler.ast.base.Type;

import automata.graph.*;

import action.Action;

public class MultiGlobal extends State<Node> {
	private final Set<Type> type_set;

	public MultiGlobal() {
		type_set = new HashSet<Type>();
		//this.type = type;
	}

	/***************************************
	 * Auxiliary
	 ***************************************/

	private MultiGlobal add(Type type) {
		type_set.add(type);
		return this;
	}

	@Override
	Set<Action> getActions() {
		Set<Action> tmpActions = new HashSet<Action>();
		for(Type t: type_set)
			tmpActions.addAll(t.getActions());
		return tmpActions;
	}

	private Set<String> activeRoles() {
		Set<String> tmpRoles = new HashSet<String>();
		for(Type t: type_set)
			tmpRoles.addAll(t.getRoles());
		return tmpRoles;
	}

	/***************************************
	 * Override object methods
	 ***************************************/

	private String toString = null;

	@Override
	public String toString() {
		if(toString == null) {
			toString = "{";
			boolean first = false;
			for(Type t: type_set) {
				if(first == true)
					toString += ", ";
				toString += "" + t;
				first = true;
			}
			toString += "}";
		}
		return toString;
	}

	public final int hashCode() {
		return toString().hashCode();
	}

	public final boolean equals(Object o) {
		if((o instanceof MultiGlobal) == false)
			return false;
		return toString().equals(((MultiGlobal) o).toString());
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
		MultiGlobal mg = new MultiGlobal();
		for(Type t: type_set) {
			Type tt = t.nextDependentState(a, new HashSet<String>());
			mg.add(tt);
		}

		r.add(mg);
		//if(t != null)
		//	r.add(new GlobalState(t));

		return r;
	}
}
