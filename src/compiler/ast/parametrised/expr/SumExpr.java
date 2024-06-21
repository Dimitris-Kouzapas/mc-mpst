package compiler.ast.parametrised.expr;

import runtime.Stream;

import compiler.ast.statement.Statement;
import compiler.ast.parametrised.Abstraction;

import compiler.ast.parametrised.Instance;

public class SumExpr extends Expr {
	private final Expr expr1, expr2;
	private final String operand;

	public SumExpr(Expr expr1, String operand, Expr expr2, int line) {
		super(line);
		this.expr1 = expr1;
		this.expr2 = expr2;
		this.operand = operand;
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
	public int evaluate(Instance a) {
		switch(operand) {
			case "+":
				return expr1.evaluate(a) + expr2.evaluate(a);
			case "-":
				return expr1.evaluate(a) - expr2.evaluate(a);
			default:
				//TODO throw exception
		}
		return -1;
	}

	@Override
	public boolean match(Integer i) {
		return false;
	}

	@Override
	public boolean match(String var) {
		return false;
	}
}
