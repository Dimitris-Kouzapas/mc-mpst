package compiler.ast.parametrised.expr;

import compiler.ast.ASTNode;

import compiler.ast.statement.Statement;

import compiler.ast.parametrised.Abstraction;
import compiler.ast.parametrised.Instance;

public abstract class BoolExpr extends ASTNode {

	BoolExpr(int line) {
		super(line);
	}

	public abstract void semanticCheck(Statement stm, Abstraction a);
	public abstract boolean evaluate(Instance a);
}
