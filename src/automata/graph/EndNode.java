package automata.graph;

import java.util.Set;
import java.util.HashSet;

import action.Action;
import runtime.Stream;

public class EndNode extends Node {

	/***************************************
	 * Auxiliary
	 ***************************************/

	@Override
	public void prettyPrint(Stream stream) {
		stream.print("end");
	}

	@Override
	Set<Action> actions() {
		return new HashSet<Action>();
	}

	@Override
	void set(String var, RecursionNode target) {
		return;
	}

	@Override
	void set(GraphMachine machine) {
		return;
	}

	@Override
	public Node normalise() {
		return this;
	}

	@Override
	boolean hasRVar(String var) {
		return false;
	}

	/***************************************
	 * Object copy
	 ***************************************/

	@Override
	public EndNode clone() {
		return (EndNode) new EndNode().set(activeRoles);
	}

	@Override
	EndNode unfold() {
		return clone();
	}

	@Override
	EndNode substitute(String var) {
		return clone();
	}

	@Override
	public Node union(Node node) {
		return node;
	}

	/***************************************
	 * Override Object methods
	 ***************************************/

	public String toString() {
		return "end";
	}

	/***************************************
	 * Bisimulation Check
	 ***************************************/

	@Override
	Set<Node> nextState(Action action) {
		return new HashSet<Node>();
	}

	/***************************************
	 * Print mCRL2
	 ***************************************/

	@Override
	String mcrl2Separator() {
		return "";
	}

	@Override
	void mCRL2(Stream stream) {
		return;
	}
}
