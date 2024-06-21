package compiler.ast.parametrised;

import runtime.Stream;

import compiler.ast.statement.Statement;
import compiler.ast.expression.Parametrised;

import compiler.ast.base.Type;
import compiler.ast.base.End;
import compiler.ast.global.GlobalPass;

import compiler.ast.parametrised.expr.BoolExpr;

public class ParametrisedPass extends ParametrisedType {
	private final BoolExpr expr;
	private final String from, to, load;
	private final ParametrisedType next;

	public ParametrisedPass(BoolExpr expr, String from, String to, String load, ParametrisedType next, int line) {
		super(line);
		this.expr = expr;
		this.from = from;
		this.to = to;
		this.load = load;
		this.next = next;
	}

	@Override
	public void prettyPrint(Stream stream) {
		if(expr != null) {
			stream.print("if (");
			expr.prettyPrint(stream);
			stream.println(")");
			stream.pushIndent();
		}
		stream.print(from + "->" + to + ": " + load + "; ");
		next.prettyPrint(stream);
		if(expr != null)
			stream.popIndent();
	}

	@Override
	public void semanticCheck(Statement stm, Parametrised parametrised, Abstraction abstraction) {
		if(expr != null)
			expr.semanticCheck(stm, abstraction);
		if(from.equals(to))
			stm.add(semanticError("Role " + from + " is sending to itself.", stm.file()));
		next.semanticCheck(stm, parametrised, abstraction);
	}

	Type execute(ParametrisedContext ctx) {
		if(expr == null || (expr != null && expr.evaluate(ctx.instance()))) {
			Type n = next.execute(ctx);
			if(n != null)
				return new GlobalPass(from, to, load, next.execute(ctx), line);
			else
				return null;
		}
		return new End(line);
	}
}
