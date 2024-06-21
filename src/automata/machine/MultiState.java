package automata.machine;

import java.util.Set;
import java.util.HashSet;

import compiler.ast.base.*;

import action.Action;

public class MultiState extends State<Type> {
	private static int _seq = 0;
	private final int seq;
	private final Set<Type> set;

	public MultiState() {
		set = new HashSet<Type>();
		seq = _seq++;
	}

	public MultiState(Type init) {
		set = new HashSet<Type>();
		seq = _seq++;
		add(init);
	}

	/*******************************
	 * Auxiliary
	 *******************************/

	@Override
	protected Set<Action> getActions() {
		Set<Action> actions = new HashSet<Action>();
		for(Type type: set)
			actions.addAll(type.getActions());
		return actions;
	}

	/*******************************
	 * Implement collection-like methods
	 *******************************/

	public MultiState add(Type t) {
		set.add(t);
		return this;
	}

	public MultiState add(MultiState s) {
		for(Type t: s.set)
			add(t);
		return this;
	}

	private boolean isEmpty() {
		return set.isEmpty();
	}

	private boolean contains(Type t) {
		return set.contains(t);
	}

	/*******************************
	 * Override Object methods
	 *******************************/

	@Override
	public int hashCode() {
		int hashCode = 0;
		for(Type t: set)
			hashCode ^= t.hashCode();

		return hashCode;
	}

	@Override
	public boolean equals(Object o) {
		if((o instanceof MultiState) == false)
			return false;

		MultiState s = (MultiState) o;

		for(Type t: s.set)
			if(contains(t) == false)
				return false;

		for(Type t: set)
			if(s.contains(t) == false)
				return false;

		return true;
	}

	private String toString = null;

	@Override
	public String toString() {
		if(toString == null) {
			toString = "{";
			boolean first = false;
			for(Type t: set) {
				if(first == true)
					toString += ", ";
				toString += "" + t;
				first = true;
			}
			toString += "}";
		}
		return toString;
	}

	/*******************************
	 * Automata Construction
	 *******************************/

	@Override
	protected End end() {
		return new End(-1);
	}

	@Override
	protected RVariable rVariable(String var) {
		return new RVariable(var, -1);
	}

	@Override
	protected Pass pass(Action action, Type next) {
		return action.create(next);
	}

	@Override
	protected Recursion recursion(String var, Type body) {
		return new Recursion(var, body, -1);
	}

	@Override
	protected Type union(Type type1, Type type2) {
		return type1.union(type2);
	}

	@Override
	protected Set<State<Type>> nextState(Action a) {
		Set<State<Type>> r = new HashSet<State<Type>>();

		MultiState next = new MultiState();
		for(Type type: set)
			next.add(type.nextMultiState(a));

		if(next.isEmpty() == false)
			r.add(next);

		return r;
	}
}
