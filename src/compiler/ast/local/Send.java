package compiler.ast.local;

import compiler.ast.statement.Statement;
import compiler.ast.expression.ProtocolDecl;
import compiler.ast.base.Type;
import compiler.ast.base.Pass;

import action.PassAction;
import action.SendAction;

import runtime.Stream;

public final class Send extends Pass {
	public Send(String to, String load, Type type, int line) {
		this(null, to, load, type, null, line);
	}

	public Send(String from, String to, String load, Type type, PassAction action, int line) {
		super(from, to, load, type, action, line);
	}

	@Override
	public void semanticCheck(Statement stm) {
		if(from.equals(to) == true)
			stm.add(semanticError("Role " + to + " is sending to itself.", stm.file()));

		super.semanticCheck(stm);
	}

	/***************************************
	 * AST Construction
	 ***************************************/

	@Override
	public void set(String role) {
		from = role;
		action = new SendAction(from, to, load);
		super.set(role);
	}

	/***************************************
	 * Auxiliary
	 ***************************************/

	@Override
	protected boolean isEqual(Pass p) {
		return (p instanceof Send) && super.isEqual(p);
	}

	@Override
	protected Send clone(Type next) {
		return new Send(from, to, load, next, action, line);
	}

	/***************************************
	 * Project
	 ***************************************/

	@Override
	protected Type _project(String role) {
		return (role.equals(to)) 	? new Send(from + "[" + to + "]", to + "[" + from + "]", load, super._project(role), new SendAction(from + "[" + to + "]", to + "[" + from + "]", load), line)
						: super._project(role);
	}
	
	protected Type project(String role, Statement stm) {
		return (role.equals(to)) 	? new Send(from + "[" + to + "]", to + "[" + from + "]", load, super.project(role, stm), new SendAction(from + "[" + to + "]", to + "[" + from + "]", load), line)
									: super.project(role, stm);
	}
}
