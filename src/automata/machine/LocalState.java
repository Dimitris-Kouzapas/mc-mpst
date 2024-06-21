package automata.machine;

import java.util.Set;
import java.util.HashSet;

import java.util.Map;
import java.util.HashMap;

import compiler.ast.base.Type;
import compiler.ast.base.End;

import automata.graph.*;

import action.ActionSet;
import action.Action;
import action.ErrorAction;

public class LocalState extends State<Node> {
	private final Map<String, Type> roles;

	public LocalState() {
		roles = new HashMap<String, Type>();
	}

	public void put(String key, Type val) {
		roles.put(key, val);
	}

	private Set<String> activeRoles() {
		Set<String> r = new HashSet<String>();
		for(Map.Entry<String, Type> e: roles.entrySet())
			if((e.getValue() instanceof End) == false)
				r.add(e.getKey());
		return r;
	}

	/***************************************
	 * Auxiliary
	 ***************************************/

	//TODO: This action set implementation is suspicious -> use actionSet from Local Context
	private Set<Action> actions = null;
	@Override
	final Set<Action> getActions() {
		if(actions == null) {
			actions = new HashSet<Action>();
			ActionSet actionSet = new ActionSet();

			for(Type t: roles.values())
				actionSet.addAll(t.getActions());

			for(Action a: actionSet.dual()) {
				actions.add(a.global());
				actions.add(a.error());
			}

			for(Action a: actionSet.single())
				actions.add(a.error());
		}

		return actions;
	}

	/***************************************
	 * Override object methods
	 ***************************************/

	public LocalState clone() {
		LocalState ls = new LocalState();
		for(Map.Entry<String, Type> e: roles.entrySet())
			ls.put(e.getKey(), e.getValue());
		return ls;
	}

	private String toString = null;
	public final String toString() {
		if(toString == null) {
			toString = "";
			for(Map.Entry<String, Type> e: roles.entrySet())
				toString += e.getValue().toString() + "_";
		}
		return toString;
	}

	public final int hashCode() {
		return toString().hashCode();
	}

	public final boolean equals(Object o) {
		if((o instanceof LocalState) == false)
			return false;
		return toString().equals(((LocalState) o).toString());
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
	Set<State<Node>> nextState(Action action) {
		Type from = roles.get(action.from);
		Type to = roles.get(action.to);

		Set<Pair<Action, Type>> fnext = null, tnext = null;
		if(from != null)
			fnext = from.nextState(action);
		if(to != null)
			tnext = to.nextState(action);

		Set<State<Node>> set = new HashSet<State<Node>>();

		if(fnext != null && tnext != null)
			for(Pair<Action, Type> f: fnext)
				for(Pair<Action, Type> t: tnext) {
					Action composed = f.getKey().compose(t.getKey());
					if(action.equals(composed)) {
						LocalState ls = clone();
						ls.put(action.from, f.getValue());
						ls.put(action.to, t.getValue());
						set.add(ls);
					}
				}
		return set;
	}
}
