package compiler.ast.base;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

import compiler.ast.statement.Statement;
import compiler.ast.expression.ProtocolDecl;

import automata.machine.Pair;
import automata.machine.MultiState;

import action.Action;
import runtime.Stream;

public final class End extends Type {
	public End(int line) {
		super(line);
	}

	@Override
	public void prettyPrint(Stream stream) {
		stream.print("end");
	}

	@Override
	public void semanticCheck(Statement stm) {
		return;
	}

	/***************************************
	 * AST Construction
	 ***************************************/

	@Override
	void set(String var, Recursion r) {
		return;
	}

	@Override
	public void set(String role) {
		return;
	}

	@Override
	public void set(ProtocolDecl pd) {
		return;
	}

	/***************************************
	 * Auxiliary
	 ***************************************/

	@Override
	Set<Action> actions() {
		return new HashSet<Action>();
	}

	@Override
	Set<String> roles() {
		return new HashSet<String>();
	}

	@Override
	public Type union(Type t) {
		return t;
	}

	/***************************************
	 * Object copy
	 ***************************************/

	@Override
	public End clone() {
		return new End(line);
	}

	@Override
	End unfold() {
		return clone();
	}

	@Override
	End substitute(String var) {
		return clone();
	}

	/***************************************
	 * From NDFA to DFA
	 ***************************************/

	@Override
	public MultiState nextMultiState(Action a) {
		return new MultiState();
	}

	/***************************************
	 * Project
	 ***************************************/

	@Override
	Type branch() {
		return clone();
	}

	@Override
	protected End _project(String role) {
		return clone();
	}

	/***************************************
	 * Automata translation
	 ***************************************/

	@Override
	List<Set<String>> independentRoles() {
		return new ArrayList<Set<String>>();
	}

	@Override
	Type unfolding(Set<String> roles) {
		return clone();
	}

	@Override
	public Type nextState(Action a, Set<String> visited) {
		return null;
	}

	@Override
	public Set<Pair<Action, Type>> nextState(Action action) {
		return new HashSet<Pair<Action, Type>>();
	}

	@Override
	boolean hasRVar(String var) {
		return false;
	}

	@Override
	public End normalise() {
		return this;
	}
}
