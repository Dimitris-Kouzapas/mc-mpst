package compiler.ast.global;

import compiler.ast.statement.Statement;

import compiler.ast.base.Type;
import compiler.ast.base.Pass;
import compiler.ast.local.Send;
import compiler.ast.local.Receive;

import action.PassAction;
import action.SendAction;
import action.ReceiveAction;

public final class GlobalPass extends Pass {
	public GlobalPass(String from, String to, String load, Type next, int line) {
		this(from, to, load, next, new PassAction(from, to, load), line);
 	}

	public GlobalPass(String from, String to, String load, Type next, PassAction action, int line) {
		super(from, to, load, next, action, line);
 	}

	@Override
	public void semanticCheck(Statement stm) {
		if(from.equals(to) == true)
			stm.add(semanticError("Role " + from + " is sending to itself.", stm.file()));

		super.semanticCheck(stm);
	}

	/***************************************
	 * Auxiliary
	 ***************************************/

	@Override
	protected boolean isEqual(Pass p) {
		return (p instanceof GlobalPass) && super.isEqual(p);
	}

	@Override
	protected GlobalPass clone(Type next) {
		return new GlobalPass(from, to, load, next, action, line);
	}

	/***************************************
	 * Project
	 ***************************************/

	@Override
	protected Type _project(String role) {
		if(role.equals(from))
			return new Send(from, to, load, super._project(role), new SendAction(from, to, load), line);
		else if(role.equals(to))
			return new Receive(to, from, load, super._project(role), new ReceiveAction(to, from, load), line);

		return super._project(role);
	}
}
