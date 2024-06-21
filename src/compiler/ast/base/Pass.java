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
import action.PassAction;
import runtime.Stream;

public abstract class Pass extends Type {
	protected String from;
	protected final String to, load;
	private final Type next;
	protected PassAction action;

	protected Pass(String from, String to, String load, Type next, PassAction action, int line) {
		super(line);
		this.from = from;
		this.to = to;
		this.load = load;
		this.next = next;
		this.action = action;
	}

	@Override
	public void prettyPrint(Stream stream) {
		stream.print(action + "; ");
		next.prettyPrint(stream);
	}

	@Override
	public void semanticCheck(Statement stm) {
		//TODO something has to be done for this mistake
//		if(ctx.has(to) == false)
//			ctx.add(semanticError("Role " + to + " is not defined in the local context.", ctx.file()));

		next.semanticCheck(stm);
	}

	/***************************************
	 * AST Construction
	 ***************************************/

	@Override
	final void set(String var, Recursion r) {
		next.set(var, r);
	}

	@Override
	public void set(String role) {
		next.set(role);
	}

	@Override
	public void set(ProtocolDecl pd) {
		pd.add(action);
		next.set(pd);
	}

	/***************************************
	 * Auxiliary
	 ***************************************/

	protected boolean isEqual(Pass p) {
		boolean flag = (from == null) ? from == p.from : from.equals(p.from);
		return flag && to.equals(p.to) && load.equals(p.load);
	}

	@Override
	Set<Action> actions() {
		Set<Action> s = next.actions();
		s.add(action);
		return s;
	}

	@Override
	final Set<String> roles() {
		Set<String> s = next.roles();
		s.add(from);
		s.add(to);
		return s;
	}

	@Override
	public final Type union(Type type) {
		if(type instanceof Pass || type instanceof Recursion)
			return new Sum(line).union(this).union(type);

		return type.union(this);
	}
	
	@Override
	Set<String> freeVar() {
		return next.freeVar();
	}

	/***************************************
	 * Object copy
	 ***************************************/

	protected abstract Pass clone(Type t);

	@Override
	public Pass clone() {
		return clone(next.clone());
	}

	@Override
	Pass unfold() {
		return clone(next.unfold());
	}

	@Override
	Pass substitute(String var) {
		return clone(next.substitute(var));
	}

	/***************************************
	 * From NDFA to DFA
	 ***************************************/

	@Override
	public MultiState nextMultiState(Action a) {
		MultiState state = new MultiState();
		if(action.equals(a))
			state.add(next);
		return state;
	}

	/***************************************
	 * Project
	 ***************************************/

	@Override
	Type branch() {
		Type n = next.branch();
		if(n instanceof Sum)
			return ((Sum)n).push(this);

		return clone(n);
	}

	@Override
	protected Type _project(String role) {
		return next._project(role);
	}

	@Override	
	Type merge(String role, Type t, Statement stm) {
		if ((t instanceof Pass) == false)
			return t.merge(role, this, stm);
	
		Pass p = (Pass) t;
		if (this.action.merges(p.action) == false) {
			stm.add(projectionError("Actions " + this.action.toString() + " and " + p.action.toString() + " cannot be merged", role, stm.file()));
		}
		if (this.action.equals(p.action))
			return clone(next.merge(role, p.next, stm));
		return new Sum(line).union(this).union(p);
	}
	
	@Override
	protected Type project(String role, Statement stm) {
		return next.project(role, stm);
	}

	/***************************************
	 * Automata translation
	 ***************************************/

	@Override
	List<Set<String>> independentRoles() {
		List<Set<String>> list = next.independentRoles();

		Set<String> tmp = new HashSet<String>();
		tmp.add(action.from);
		tmp.add(action.to);

		List<Set<String>> r = new ArrayList<Set<String>>();

		for(Set<String> rset: list)
			if(rset.contains(action.from) || rset.contains(action.to))
				tmp.addAll(rset);
			else
				r.add(rset);

		r.add(tmp);
		return r;
	}

	@Override
	Type unfolding(Set<String> roles) {
		return (roles.contains(action.from) || roles.contains(action.to)) ? clone(next.unfolding(roles)) : next.unfolding(roles);
	}

	@Override
	public Type nextState(Action a, Set<String> visited) {
		if(action.equals(a))
			return next;	//TODO why not clone it?
		else if(action.dependency(a))
			return null;
		Type tmp = next.nextState(a, visited);

		return (tmp != null) ? clone(tmp) : null;
	}

	@Override
	public Set<Pair<Action, Type>> nextState(Action a) {
		Set<Pair<Action, Type>> r = new HashSet<Pair<Action, Type>>();
		if(action.from.equals(a.from) && action.to.equals(a.to))
			r.add(new Pair<Action, Type>(action, next));

		return r;
	}

	@Override
	boolean hasRVar(String var) {
		return next.hasRVar(var);
	}

	@Override
	public Pass normalise() {
		return clone(next.normalise());
	}

	/***************************************
	 * Encoding semantics 
	 ***************************************/

	@Override
	final Type prod(Type type) {
		if(type instanceof Pass || type instanceof Recursion || type instanceof Sum)
			return new Parallel(line).prod(this).prod(type);

		return type.prod(this);
	}
	
	@Override
	boolean wellConnected() {
		return this.connected() && next.wellConnected();
	}
	
//	@Override
//	boolean wellParallel() {
//		return next.wellParallel();
//	}
	
	@Override
	protected Type encodeParallel() {
		return next.encodeParallel();
	}
	
	@Override
	protected List<Type> encodeParallel(List<Set<String>> connectedParticipants) {
		return next.encodeParallel(connectedParticipants);
	}
}

