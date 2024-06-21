package compiler.ast.expression;

import compiler.Protocol;
import compiler.ast.ASTNode;
import compiler.ast.statement.Statement;

import runtime.Program;
import runtime.Stream;

public abstract class Expression extends ASTNode {
	Program p;
	Expression(int line) {
		super(line);
	}

	public final void set(Program p) {
		this.p = p;
	}

	public abstract void prettyPrint(Stream stream);

	public abstract void semanticCheck(Statement stm);
	public abstract Protocol execute(Program p);
	public abstract String id();
}
