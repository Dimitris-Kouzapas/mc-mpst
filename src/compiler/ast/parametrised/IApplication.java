package compiler.ast.parametrised;

import java.util.List;
import java.util.ArrayList;

import runtime.Stream;
import compiler.ast.statement.Statement;
import compiler.ast.expression.Parametrised;

import compiler.ast.parametrised.expr.ValueExpr;

import compiler.ast.base.Type;

public class IApplication extends ParametrisedType {
	private final String id;
	private List<ValueExpr> arguments;

	public IApplication(String id, List<ValueExpr> arguments, int line) {
		super(line);
		this.id = id;
		this.arguments = arguments;
	}

	@Override
	public void prettyPrint(Stream stream) {
		stream.print(id);
		for(ValueExpr expr: arguments){
			stream.print(" ");
			expr.prettyPrint(stream);
		}
	}

	public void semanticCheck(Statement stm, Parametrised parametrised) {
		if(parametrised.match(id, arguments.size()) == false)
			stm.add(semanticError("Application " + id + " is unmatched.", stm.file()));
	}

	@Override
	public void semanticCheck(Statement stm, Parametrised parametrised, Abstraction abstraction) {
		semanticCheck(stm, parametrised);
	}

	public Type execute(ParametrisedContext ctx) {
		List<Integer> args = new ArrayList<Integer>();

		for(ValueExpr v: arguments)
			args.add(v.evaluate(null));

		return ctx.execute(id, args);
	}
}
