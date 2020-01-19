package automata.graph;

import java.util.Set;
import action.Action;

import runtime.Stream;

public class RecursionNode extends Node {
	private final String var;
	private final Node body;
	private int processIndex;

	public RecursionNode(String var, Node body) {
		this.var = var;
		this.body = body;
		this.body.set(var, this);
	}

	/***************************************
	 * Auxiliary
	 ***************************************/

	@Override
	public void prettyPrint(Stream stream) {
		stream.print(var + ". ");
		body.prettyPrint(stream);
	}

	@Override
	Set<Action> actions() {
		return body.actions();
	}

	@Override
	void set(String var, RecursionNode target) {
		if(this.var.equals(var) == false)
			body.set(var, target);
	}

	@Override
	void set(GraphMachine machine) {
		processIndex = machine.add(this);
		body.set(machine);
	}

	int processIndex() {
		return processIndex;
	}

	@Override
	public Node normalise() {
		return (body.hasRVar(var)) ? clone(body.normalise()) : body.normalise();
	}

	@Override
	boolean hasRVar(String var) {
		return this.var.equals(var) ? false : body.hasRVar(var);
	}

	/***************************************
	 * Object copy
	 ***************************************/

	public RecursionNode clone(Node node) {
		return (RecursionNode) new RecursionNode(var, node).set(activeRoles);
	}

	@Override
	public RecursionNode clone() {
		return clone(body.clone());
	}

	@Override
	Node unfold() {
		return body.substitute(var);
	}

	@Override
	Node substitute(String var) {
		if(this.var.equals(var) == false)
			return clone(body.substitute(var));
		return clone();
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
			toString = var + ". ";
			toString += body.toString();
		}
		return toString;
	}

	/***************************************
	 * Bisimulation Check
	 ***************************************/

	@Override
	Set<Node> nextState(Action action) {
		return body.nextState(action);
		//return unfold().nextState(action);
	}

	/***************************************
	 * Print mCRL2
	 ***************************************/

	@Override
	void mCRL2(Stream stream) {
		stream.print(GraphMachine.recSymbol + processIndex);
	}

	void mCRL2Body(Stream stream) {
		body.mCRL2(stream);
	}
}
