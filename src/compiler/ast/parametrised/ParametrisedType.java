package compiler.ast.parametrised;

import compiler.ast.ASTNode;
import compiler.ast.statement.Statement;
import compiler.ast.expression.Parametrised;
import compiler.ast.base.Type;


public abstract class ParametrisedType extends ASTNode {
	ParametrisedType(int line) {
		super(line);
	}

	public abstract void semanticCheck(Statement stm, Parametrised parametrised, Abstraction abstraction);
	abstract Type execute(ParametrisedContext ctx);
}
