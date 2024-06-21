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

public final class RVariable extends Type {
	private final String var;
	private Recursion target;

	public RVariable(String var, int line) {
		super(line);
		this.var = var;
		this.target = null;
	}

	@Override
	public void prettyPrint(Stream stream) {
		stream.print(var);
	}

	@Override
	public void semanticCheck(Statement stm) {
		if(target == null)
			stm.add(semanticError("Recursive variable " + var + " is unguarded.", stm.file()));
	}

	/***************************************
	 * AST Construction
	 ***************************************/

	@Override
	void set(String var, Recursion r) {
		if(target == null && this.var.equals(var))
			target = r;
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
		new Exception("Fatal Error. Operation on unguarded recursive variable").printStackTrace();
		System.exit(-1);
		return null;
	}

	@Override
	Set<String> freeVar() {
		Set<String> tmp = new HashSet<String>();
		tmp.add(var);
		return tmp;
	}

	/***************************************
	 * Object copy
	 ***************************************/

	@Override
	public final RVariable clone() {
		return new RVariable(var, line);
	}

	@Override
	final Recursion unfold() {
		new Exception("Fatal Error. Operation on unguarded recursive variable").printStackTrace();
		System.exit(-1);
		return null;
	}

	@Override
	Type substitute(String var) {
		if(this.var.equals(var))
			return target.clone();
		return clone();
	}

	/***************************************
	 * From NDFA to DFA
	 ***************************************/

	@Override
	public MultiState nextMultiState(Action a) {
		return target.nextMultiState(a);
	}

	/***************************************
	 * Project
	 ***************************************/

	@Override
	Type branch() {
		return clone();
	}

	@Override
	protected RVariable _project(String role) {
		return clone();
	}
	
	@Override
	Type merge(String role, Type t, Statement stm) {
		if ((t instanceof RVariable) == false)
			stm.add(projectionError("Cannot merge recursive variable " + this.var + " with type " + t.toString() + ".", role, stm.file()));
		else {
			RVariable r = (RVariable) t;
			if (this.var.equals(r.var) == false)
				stm.add(projectionError("Cannot merge two different recursive variables: " + var + " and " + r.var + ".", role, stm.file()));
		}
		return clone();
	}
	
	@Override
	protected RVariable project(String role, Statement stm) {
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
		return target.clone();
	}

	@Override
	public Type nextState(Action a, Set<String> visited) {
		new Exception("Fatal Error. Operation on unguarded recursive variable").printStackTrace();
		System.exit(-1);
		return null;
	}

	@Override
	public Set<Pair<Action, Type>> nextState(Action action) {
		new Exception("Fatal Error. Operation on unguarded recursive variable").printStackTrace();
		System.exit(-1);
		return null;
	}

	@Override
	boolean hasRVar(String var) {
		return this.var.equals(var);
	}

	@Override
	public RVariable normalise() {
		return clone();
	}

	/***************************************
	 * Encoding semantics 
	 ***************************************/

	@Override
	Type prod(Type t) {
		new Exception("Fatal Error. Operation on unguarded recursive variable").printStackTrace();
		System.exit(-1);
		return null;
	}

	@Override
	boolean wellConnected() {
		return true;
	}
	
//	@Override
//	boolean wellParallel() {
//		return true;
//	}

	@Override
	protected Type encodeParallel() {
		return clone();
	}
	
	@Override
	protected List<Type> encodeParallel(List<Set<String>> connectedParticipants) {
		List<Type> globalTypes = new ArrayList<Type>();
		for(Set<String> p: connectedParticipants)
			globalTypes.add(clone());
		return globalTypes;
	}
}
