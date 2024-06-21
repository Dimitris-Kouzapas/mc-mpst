package compiler.ast.parametrised.expr;

import runtime.Stream;

import compiler.ast.statement.Statement;
import compiler.ast.parametrised.Abstraction;

import compiler.ast.parametrised.Instance;

public class VarExpr extends Expr {
	private final String var;
	public VarExpr(String var, int line) {
		super(line);
		this.var = var;
	}

	public String var() {
		return var;
	}

	@Override
	public void prettyPrint(Stream stream) {
		stream.print(var);
	}

	@Override
	public void semanticCheck(Statement stm, Abstraction a) {
		if(a.has(var) == false)
			stm.add(semanticError("Variable " + var + " is out of scope.", stm.file()));
	}

	@Override
	public int evaluate(Instance a) {
		return a.valueof(var);
	}

	@Override
	public boolean match(Integer i) {
		return true;
	}

	@Override
	public boolean match(String var) {
		return this.var.equals(var);
	}
}
