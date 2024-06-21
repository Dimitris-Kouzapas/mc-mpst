package compiler.ast.parametrised.expr;

import runtime.Stream;

import compiler.ast.statement.Statement;

import compiler.ast.parametrised.Abstraction;;
import compiler.ast.parametrised.Instance;

public class RelExpr extends BoolExpr {
	private final BoolExpr expr1, expr2;
	private final String operand;

	public RelExpr(BoolExpr expr1, String operand, BoolExpr expr2, int line) {
		super(line);
		this.expr1 = expr1;
		this.operand = operand;
		this.expr2 = expr2;
	}

	@Override
	public void prettyPrint(Stream stream) {
		expr1.prettyPrint(stream);
		stream.print(" " + operand + " ");
		expr2.prettyPrint(stream);
	}

	@Override
	public void semanticCheck(Statement stm, Abstraction a) {
		expr1.semanticCheck(stm, a);
		expr2.semanticCheck(stm, a);
	}

	@Override
	public boolean evaluate(Instance a) {
		switch(operand) {
			case "==":
				return expr1.evaluate(a) == expr2.evaluate(a);
			case "!=":
				return expr1.evaluate(a) != expr2.evaluate(a);
			default:
				//TODO throw exception
		}
		return false;
	}
}
