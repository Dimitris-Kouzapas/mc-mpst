package compiler.ast.parametrised.expr;

import runtime.Stream;
import compiler.ast.statement.Statement;

import compiler.ast.parametrised.Abstraction;
import compiler.ast.parametrised.Instance;

public class False extends BoolExpr {

	public False(int line) {
		super(line);
	}

	@Override
	public void prettyPrint(Stream stream) {
		stream.print("false");
	}

	@Override
	public void semanticCheck(Statement stm, Abstraction a) {
	}

	@Override
	public boolean evaluate(Instance a) {
		return false;
	}
}
