package compiler.ast.parametrised.expr;

import compiler.ast.ASTNode;

import compiler.ast.statement.Statement;
import compiler.ast.parametrised.Abstraction;

import compiler.ast.parametrised.Instance;

public abstract class Expr extends ASTNode {

	Expr(int line) {
		super(line);
	}

	public abstract void semanticCheck(Statement stm, Abstraction a);
	public abstract int evaluate(Instance a);
	public abstract boolean match(Integer i);
	public abstract boolean match(String var);
}

