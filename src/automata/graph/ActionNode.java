package automata.graph;

import java.util.Set;
import java.util.HashSet;

import action.Action;

import runtime.Stream;

public class ActionNode extends Node {
	private final Action action;
	private final Node next;

	public ActionNode(Action action, Node next) {
		this.action = action;
		this.next = next;
	}

	/***************************************
	 * Auxiliary
	 ***************************************/

	@Override
	public void prettyPrint(Stream stream) {
		stream.print(action + ". ");
		next.prettyPrint(stream);
	}

	@Override
	Set<Action> actions() {
		Set<Action> actions = next.actions();
		actions.add(action);
		return actions;
	}

	@Override
	void set(String var, RecursionNode target) {
		next.set(var, target);
	}

	@Override
	void set(GraphMachine machine) {
		machine.add(action);
		next.set(machine);
	}

	@Override
	public Node normalise() {
		return clone(next.normalise());
	}

	@Override
	boolean hasRVar(String var) {
		return next.hasRVar(var);
	}

	/***************************************
	 * Object copy
	 ***************************************/

	private ActionNode clone(Node next) {
		return (ActionNode) new ActionNode(action, next).set(activeRoles);
	}

	@Override
	public ActionNode clone() {
		return clone(next.clone());
	}

	@Override
	ActionNode unfold() {
		return clone(next.unfold());
	}

	@Override
	ActionNode substitute(String var) {
		return clone(next.substitute(var));
	}

	//TODO active roles
	@Override
	public Node union(Node node) {
		if((node instanceof ActionNode) || (node instanceof RecursionNode))
			return new SumNode().add(this).add(node);

		return node.union(this);
	}

	/***************************************
	 * Override Object methods
	 ***************************************/

	private String toString = null;
	public String toString() {
		if(toString == null) {
			toString = action + ". ";
			toString += next.toString();
		}
		return toString;
	}

	/***************************************
	 * Bisimulation Check
	 ***************************************/

	@Override
	Set<Node> nextState(Action a) {
		Set<Node> r = new HashSet<Node>();
		if(action.equals(a))
			r.add(next);
		return r;
	}

	/***************************************
	 * Print mCRL2
	 ***************************************/

	@Override
	void mCRL2(Stream stream) {
		stream.print(action.action());
		stream.print(next.mcrl2Separator());
		next.mCRL2(stream);
	}
}
