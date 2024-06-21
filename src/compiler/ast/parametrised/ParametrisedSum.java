package compiler.ast.parametrised;

import java.util.List;

import runtime.Stream;

import compiler.ast.statement.Statement;
import compiler.ast.expression.Parametrised;

import compiler.ast.base.Type;
import compiler.ast.base.Pass;
import compiler.ast.base.End;

public class ParametrisedSum extends ParametrisedType {
	private final List<ParametrisedPass> list;

	public ParametrisedSum(List<ParametrisedPass> list, int line) {
		super(line);
		this.list = list;
	}

	@Override
	public void prettyPrint(Stream stream) {
		boolean first = true;
		stream.print("(");
		stream.pushIndent();
		for(ParametrisedPass p: list) {
			stream.println();
			stream.println(first == true ? "choice" : "or");
			stream.pushIndent();
			p.prettyPrint(stream);
			stream.popIndent();
			first = false;
		}
		stream.popIndent();
		stream.println();
		stream.print(")");
	}

	@Override
	public void semanticCheck(Statement stm, Parametrised parametrised, Abstraction abstraction) {
		for(ParametrisedPass p: list)
			p.semanticCheck(stm, parametrised, abstraction);
	}

	Type execute(ParametrisedContext ctx) {
		Type type = new End(line);
		for(ParametrisedPass p: list) {
			Type tmp = p.execute(ctx);
			if(tmp != null)
				type = type.union(tmp);
			else
				return null;
		}
		return type;
	}
}
