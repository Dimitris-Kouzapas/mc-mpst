package automata.graph;

import java.util.Set;

import action.Action;

import compiler.PrettyPrint;
import runtime.Stream;

public abstract class Node implements PrettyPrint {
	private static int _seq = 0;
	final int seq;
	Set<String> activeRoles;

	Node() {
		seq = _seq++;
	}

	public Node set(Set<String> activeRoles) {
		this.activeRoles = activeRoles;
		return this;
	}

	boolean active(Node node) {
		Set<String> activeRoles2 = node.activeRoles;
		for(String s: activeRoles)
			if(activeRoles2.contains(s) == false)
				return false;

		for(String s: activeRoles2)
			if(activeRoles.contains(s) == false)
				return false;

		return true;
	}

	/***************************************
	 * Auxiliary
	 ***************************************/
	public abstract void prettyPrint(Stream stream);

	abstract void set(String var, RecursionNode target);
	abstract void set(GraphMachine machine);

	abstract Set<Action> actions();
	private Set<Action> actions = null;

	public final Set<Action> getActions() {
		if(actions == null)
			actions = actions();
		return actions;
	}


	public abstract Node union(Node node);

	abstract Node unfold();
	abstract Node substitute(String var);

	public abstract Node normalise();
	abstract boolean hasRVar(String var);

	/***************************************
	 * Override object methods
	 ***************************************/

	public abstract Node clone();

//	private String toString = null;
//	public final String toString() {
//		if(toString == null) {
//			Stream stream = new Stream();
//			prettyPrint(stream);
//			toString = stream.toString();
//		}
//		return toString;
//	}

	public final int hashCode() {
		return toString().hashCode();
	}

	public final boolean equals(Object o) {
		if((o instanceof Node) == false)
			return false;
		return toString().equals(((Node) o).toString());
	}

	/***************************************
	 * Bisimulation Check
	 ***************************************/

	abstract Set<Node> nextState(Action action);

	/***************************************
	 * Print mCRL2
	 ***************************************/

	String mcrl2Separator() {
		return ".";
	}

	abstract void mCRL2(Stream stream);
}
