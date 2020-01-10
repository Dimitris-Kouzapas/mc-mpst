package automata.graph;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

import action.Action;
import runtime.Stream;

public class SumNode extends Node {
	private final List<Node> list;

	public SumNode() {
		this(new ArrayList<Node>());
	}

	SumNode(List<Node> list) {
		this.list = list;
	}

	public SumNode add(Node node) {
		list.add(node);
		return this;
	}

	/***************************************
	 * Auxiliary
	 ***************************************/

	@Override
	public void prettyPrint(Stream stream) {
		boolean first = true;
		stream.print("(");
		stream.pushIndent();
		for(Node n: list) {
			stream.println();
			stream.println(first == true ? "choice" : "or");
			stream.pushIndent();
			n.prettyPrint(stream);
			stream.popIndent();
			first = false;
		}
		stream.popIndent();
		stream.println();
		stream.print(")");
	}

	@Override
	Set<Action> actions() {
		Set<Action> actions = new HashSet<Action>();
		for(Node n: list)
			actions.addAll(n.actions());

		return actions;
	}

	@Override
	void set(String var, RecursionNode target) {
		for(Node n: list)
			n.set(var, target);
	}

	@Override
	void set(GraphMachine machine) {
		for(Node n: list)
			n.set(machine);
	}

	@Override
	public Node normalise() {
		List<Node> list = new ArrayList<Node>();
		for(Node n: this.list)
			list.add(n.normalise());
		return new SumNode(list).set(activeRoles);
	}

	@Override
	boolean hasRVar(String var) {
		for(Node n: list)
			if(n.hasRVar(var))
				return true;
		return false;
	}

	/***************************************
	 * Object copy
	 ***************************************/

	@Override
	public Node clone() {
		Node tmp = new EndNode();
		for(Node n: list)
			tmp = tmp.union(n.clone());

		return tmp.set(activeRoles);
	}

	@Override
	Node unfold() {
		Node tmp = new EndNode();
		for(Node n: list)
			tmp = tmp.union(n.unfold());
		return tmp.set(activeRoles);
	}

	@Override
	Node substitute(String var) {
		List<Node> list = new ArrayList<Node>();
		for(Node n: this.list)
			list.add(n.substitute(var));
		return new SumNode(list).set(activeRoles);
	}

	//TODO active roles
	@Override
	public Node union(Node node) {
		if(node instanceof SumNode) {
			for(Node n: ((SumNode) node).list)
				list.add(n);
			return this;
		}
		else if((node instanceof ActionNode) || (node instanceof RecursionNode)) {
			list.add(node);
			return this;
		}
		return node.union(this);
	}

	/***************************************
	 * Override Object methods
	 ***************************************/

	private String toString = null;
	public String toString() {
		if(toString == null) {
			boolean first = true;
			toString = "(";
			//stream.pushIndent();
			for(Node n: list) {
				toString += first == true ? "choice " : "or ";
				toString += n.toString() + " ";
				first = false;
			}
			//stream.popIndent();
			//toString += "\n";
			toString += ")";
		}
		return toString;
	}

	/***************************************
	 * Bisimulation Check
	 ***************************************/

	@Override
	Set<Node> nextState(Action action) {
		Set<Node> r = new HashSet<Node>();
		for(Node n: list)
			r.addAll(n.nextState(action));

		return r;
	}

	/***************************************
	 * Print mCRL2
	 ***************************************/

	@Override
	void mCRL2(Stream stream) {
		boolean first = true;
		stream.print("(");
		for(Node n: list) {
			if(first == false)
				stream.print(" + ");
			n.mCRL2(stream);
			first = false;
		}
		stream.print(")");
	}
}
