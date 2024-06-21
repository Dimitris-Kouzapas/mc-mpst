package compiler.ast.expression;

import compiler.Protocol;
import compiler.ast.statement.Statement;

import runtime.Program;
import runtime.Stream;

public class IDExpression extends Expression {
	private final String id;
	public IDExpression(String id, int line) {
		super(line);
		this.id = id;
	}

	@Override
	public void prettyPrint(Stream stream) {
		stream.print(id);
	}

	@Override
	public void semanticCheck(Statement stm) {
		if(p.get(id) == null)
			stm.add(semanticError("Type " + id + " is not defined", stm.file()));
	}

	/*************************************
	 * Execute
	 *************************************/

	@Override
	public Protocol execute(Program p) {
		return p.get(id).execute(p);
	}

	@Override
	public String id() {
		return id;
	}
}
