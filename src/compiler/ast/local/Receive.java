package compiler.ast.local;

import compiler.ast.statement.Statement;
import compiler.ast.expression.ProtocolDecl;
import compiler.ast.base.Type;
import compiler.ast.base.Pass;

import action.PassAction;
import action.ReceiveAction;

import runtime.Stream;

public final class Receive extends Pass {
	public Receive(String role, String load, Type type, int line) {
		this(null, role, load, type, null, line);
	}

	public Receive(String from, String to, String load, Type type, PassAction action, int line) {
		super(from, to, load, type, action, line);
	}

	@Override
	public void semanticCheck(Statement stm) {
		if(from.equals(to) == true)
			stm.add(semanticError("Role " + to + " is receiving from itself.", stm.file()));

		super.semanticCheck(stm);
	}

	/***************************************
	 * AST Construction
	 ***************************************/

	@Override
	public void set(String role) {
		from = role;
		action = new ReceiveAction(from, to, load);
		super.set(role);
	}

	/***************************************
	 * Auxiliary
	 ***************************************/

	@Override
	protected boolean isEqual(Pass p) {
		return (p instanceof Receive) && super.isEqual(p);
	}

	@Override
	protected Receive clone(Type next) {
		return new Receive(from, to, load, next, action, line);
	}

	/***************************************
	 * Project
	 ***************************************/

	@Override
	protected Type _project(String role) {
		return (role.equals(to))	? new Receive(from + "[" + to + "]", to + "[" + from + "]", load, super._project(role), new ReceiveAction(from + "[" + to + "]", to + "[" + from + "]", load), line)
						: super._project(role);
	}
}
