package automata.machine;

import java.util.Set;

import action.Action;

public abstract class State<T> {

	/***************************************
	 * Construct new graph
	 ***************************************/
	//TODO need a normalisation method on type T that will remove redundant recursions

	abstract T end();
	abstract T rVariable(String var);
	abstract T pass(Action a, T next);
	abstract T recursion(String var, T body);

	abstract T union(T t1, T t2);

	/***************************************
	 * StateMachine construction
	 ***************************************/

	abstract Set<Action> getActions();
	abstract Set<State<T>> nextState(Action a);

	/***************************************
	 * Override object methods
	 ***************************************/
	public abstract boolean equals(Object o);
	public abstract int hashCode();
}
