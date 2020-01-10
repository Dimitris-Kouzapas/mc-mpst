package compiler.ast.expression;

import compiler.Protocol;
import compiler.ast.statement.Statement;

import runtime.Program;
import runtime.Stream;

public class Project extends Expression {
	private Expression expr;

	public Project(Expression expr, int line) {
		super(line);
		this.expr = expr;
	}

	@Override
	public void prettyPrint(Stream stream) {
		stream.print("project ");
		expr.prettyPrint(stream);
	}

	@Override
	public void semanticCheck(Statement stm) {
		expr.set(p);
		expr.semanticCheck(stm);
	}

	/*************************************
	 * Execute
	 *************************************/

	@Override
	public Protocol execute(Program p) {
		Protocol protocol = expr.execute(p);

		p.verbose("Projecting type " + expr.id());

		return protocol.projectionSet();
	}

	@Override
	public String id() {
		return "projection_" + expr.id();
	}
}
