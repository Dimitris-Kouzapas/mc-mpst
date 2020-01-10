package compiler.ast.parametrised.expr;

import runtime.Stream;

import compiler.ast.statement.Statement;
import compiler.ast.parametrised.Abstraction;

import compiler.ast.parametrised.Instance;

public class ValueExpr extends Expr {
	private final int value;
	public ValueExpr(String i, int line) {
		super(line);
		value = Integer.parseInt(i);
	}

	@Override
	public void prettyPrint(Stream stream) {
		stream.print("" + value);
	}

	@Override
	public void semanticCheck(Statement stm, Abstraction a) {
	}

	@Override
	public int evaluate(Instance a) {
		return value;
	}

	@Override
	public boolean match(Integer i) {
		return value == i;
	}

	@Override
	public boolean match(String var) {
		return false;
	}
}
