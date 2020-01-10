package automata.graph;

import java.util.Set;
import java.util.HashSet;

import action.Action;
import runtime.Stream;

public class RVariableNode extends Node {
	private final String var;
	private RecursionNode target;

	public RVariableNode(String var) {
		this.var = var;
	}

	/***************************************
	 * Auxiliary
	 ***************************************/

	@Override
	public void prettyPrint(Stream stream) {
		stream.print(var);
	}

	@Override
	Set<Action> actions() {
		return new HashSet<Action>();
	}

	@Override
	void set(String var, RecursionNode target) {
		if(this.var.equals(var))
			this.target = target;
	}

	@Override
	void set(GraphMachine machine) {
		return;
	}

	@Override
	public Node normalise() {
		return clone();
	}

	@Override
	boolean hasRVar(String var) {
		return this.var.equals(var);
	}

	/***************************************
	 * Object copy
	 ***************************************/

	@Override
	public RVariableNode clone() {
		return (RVariableNode) new RVariableNode(var).set(activeRoles);
	}

	@Override
	RecursionNode unfold() {
		new Exception("Fatal Error. Operation on unguarded state machine loop variable").printStackTrace();
		System.exit(-1);
		return null;
	}

	@Override
	Node substitute(String var) {
		if(this.var.equals(var))
			return target.clone();
		return clone();
	}

	@Override
	public Node union(Node node) {
		new Exception("Fatal Error. Operation on unguarded state machine loop variable").printStackTrace();
		System.exit(-1);
		return null;
	}

	/***************************************
	 * Override Object methods
	 ***************************************/

	public String toString() {
		return var;
	}

	/***************************************
	 * Bisimulation Check
	 ***************************************/

	@Override
	Set<Node> nextState(Action action) {
		new Exception("Fatal Error. Next state operation on unguarded state machine loop variable").printStackTrace();
		System.exit(-1);
		return null;
	}

	/***************************************
	 * Print mCRL2
	 ***************************************/

	@Override
	public void mCRL2(Stream stream) {
		stream.print(GraphMachine.recSymbol + target.processIndex());
	}
}
