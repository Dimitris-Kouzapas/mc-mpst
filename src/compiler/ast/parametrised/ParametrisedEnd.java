package compiler.ast.parametrised;

import runtime.Stream;

import compiler.ast.statement.Statement;
import compiler.ast.expression.Parametrised;

import compiler.ast.base.End;

public class ParametrisedEnd extends ParametrisedType {
	public ParametrisedEnd(int line) {
		super(line);
	}

	End execute(ParametrisedContext ctx) {
		return new End(line);
	}

	@Override
	public void prettyPrint(Stream stream) {
		stream.print("end");
	}

	@Override
	public void semanticCheck(Statement stm, Parametrised parametrised, Abstraction abstraction) {
	}
}
