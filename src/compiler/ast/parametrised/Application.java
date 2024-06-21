package compiler.ast.parametrised;

import java.util.List;
import java.util.ArrayList;

import runtime.Stream;

import compiler.ast.statement.Statement;
import compiler.ast.expression.Parametrised;

import compiler.ast.parametrised.expr.Expr;

import compiler.ast.base.Type;

public class Application extends ParametrisedType {
	private final String id;
	private List<Expr> arguments;

	public Application(String id, List<Expr> arguments, int line) {
		super(line);
		this.id = id;
		this.arguments = arguments;
	}

	@Override
	public void semanticCheck(Statement stm, Parametrised parametrised, Abstraction abstraction) {
		for(Expr expr: arguments)
			expr.semanticCheck(stm, abstraction);
		if(parametrised.match(id, arguments.size()) == false)
			stm.add(semanticError("Application " + id + " is unmatched.", stm.file()));
	}

	@Override
	public void prettyPrint(Stream stream) {
		stream.print(id);
		for(Expr expr: arguments) {
			stream.print(" ");
			expr.prettyPrint(stream);
		}
	}

	Type execute(ParametrisedContext ctx) {
		List<Integer> args = new ArrayList<Integer>();

		for(Expr e: arguments)
			args.add(e.evaluate(ctx.instance()));

		return ctx.execute(id, args);
	}
}
