package automata.machine;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Queue;

import java.util.List;
import java.util.LinkedList;

import java.util.List;
import java.util.ArrayList;

//import ast.base.*;
import automata.graph.*;

import action.Action;

public class StateMachine<T> {

	private final State<T> init;
	private final Set<Transition<T>> transitions;
	private final Set<State<T>> states;
	private final Map<Integer, String> freshVar;
	private int seq = 0;

	public StateMachine(State<T> init) {
		this.init = init;
		transitions = new HashSet<Transition<T>>();
		states = new HashSet<State<T>>();
		freshVar = new HashMap<Integer, String>();
	}

	public final StateMachine add(State<T> prev, Action a, State<T> next) {
		transitions.add(new Transition<T>(prev, a, next));
		return this;
	}

	/*****************************
	* Override object methods
	******************************/

	public String toString() {
		String s = "";
		for(Transition t : transitions)
			s += t +"\n";
		return s;
	}

	/*****************************
	* Collection-like methods
	******************************/

	public final StateMachine add(State<T> t) {
		states.add(t);
		return this;
	}

	public final boolean has(State<T> s) {
		return states.contains(s);
	}

	/*****************************
	* A class for transitions
	******************************/

	private class Transition<E> {
		final State<E> prev, next;
		final Action action;

		Transition(State<E> prev, Action action, State<E> next) {
			this.prev = prev;
			this.next = next;
			this.action = action;
		}

		public int hashCode() {
			return prev.hashCode() ^ action.hashCode() ^ next.hashCode();
		}

		public boolean equals(Object o) {
			if((o instanceof Transition) == false)
				return false;

			Transition t = (Transition) o;

			return prev.equals(t.prev) &&  action.equals(t.action) && next.equals(t.next);
		}

		public String toString() {
			return "(" + prev + ", " + action + ", " + next + ")";
		}
	}

	/*****************************
	* Create state machine
	******************************/

	private final List<Transition<T>> next(State<T> s) {
		List<Transition<T>> set = new LinkedList<Transition<T>>();

		for(Transition<T> t: transitions)
			if(t.prev.equals(s))
				set.add(t);

		return set;
	}

	private final void isRecursive(State<T> s, Set<State<T>> visited) {
		if(visited.contains(s))
			return;

		visited.add(s);

		for(Transition<T> t: transitions)
			if(t.prev.equals(s))
				isRecursive(t.next, visited);

		return;
	}

	private final boolean isRecursive(State<T> s) {
		Set<State<T>> visited = new HashSet<State<T>>();

		for(Transition<T> t: transitions)
			if(t.prev.equals(s))
				isRecursive(t.next, visited);

		return visited.contains(s);
	}

	private final String freshVar(int hash) {
		if (freshVar.containsKey(hash) == false)
			freshVar.put(hash, "t" + ++seq);

		return freshVar.get(hash);
	}

	public final T translate() {
		Queue<State<T>> queue = new LinkedList<State<T>>(); 

		queue.add(init);
		Set<Action> actions = init.getActions();

		do {
			State<T> current = queue.poll();
			if(has(current) == false) {
				for(Action a: actions) {
					Set<State<T>> set = current.nextState(a);
					for(State<T> next: set) {
						queue.add(next);
						add(current, a, next);
					}
					add(current);
				}
			}
		} while(queue.peek() != null);

		return graph(init, new HashSet<State<T>>());
	}

	/*****************************
	* Create graph
	******************************/

	private final T graph(State<T> s, Set<State<T>> visited) {
		if(visited.contains(s))
			return s.rVariable(freshVar(s.hashCode()));

		visited.add(s);

		T cur = s.end();
		for(Transition<T> transition: next(s)) {
			T next = graph(transition.next, visited);
			T n = s.pass(transition.action, next);
			cur = s.union(cur, n);
		}

		if(isRecursive(s))
			cur = s.recursion(freshVar(s.hashCode()), cur);

		visited.remove(s);

		return cur;
	}
}
