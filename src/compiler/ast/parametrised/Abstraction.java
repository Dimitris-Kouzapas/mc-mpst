package compiler.ast.parametrised;

import java.util.List;

import runtime.Stream;

import compiler.ast.ASTNode;

import compiler.ast.statement.Statement;
import compiler.ast.expression.Parametrised;

import compiler.ast.parametrised.expr.Expr;
import compiler.ast.base.Type;

public class Abstraction extends ASTNode {
	private final String id;
	private final List<Expr> parameters;
	private final ParametrisedType body;

	public Abstraction(String id, List<Expr> parameters, ParametrisedType body, int line) {
		super(line);
		this.id = id;
		this.parameters = parameters;
		this.body = body;
	}

	@Override
	public void prettyPrint(Stream stream) {
		stream.print(id);
		for(Expr expr: parameters) {
			stream.print(" ");
			expr.prettyPrint(stream);
		}
		stream.print(" = ");
		body.prettyPrint(stream);
	}

	public void semanticCheck(Statement stm, Parametrised parametrised) {
		body.semanticCheck(stm, parametrised, this);
	}

	public boolean has(String var) {
		for(Expr expr: parameters)
			if(expr.match(var) == true)
				return true;

		return false;
	}

	public boolean match(String name, int argsize) {
		return (id.equals(name) == true && parameters.size() == argsize);
	}

	public boolean match(String name, List<Integer> arguments) {
		if(id.equals(name) == false)
			return false;

		if(parameters.size() != arguments.size())
			return false;

		int i = 0;
		for(Expr e: parameters)
			if(e.match(arguments.get(i++)) == false)
				return false;

		return true;
	}

	List<Expr> parameters() {
		return parameters;
	}

	Type execute(ParametrisedContext ctx) {
		return body.execute(ctx);
	}
}
