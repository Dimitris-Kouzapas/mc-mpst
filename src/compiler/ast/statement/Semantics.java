package compiler.ast.statement;

import compiler.Protocol;
import compiler.ast.expression.Expression;

import automata.graph.Node;

import runtime.Program;
import runtime.Stream;

public class Semantics extends Statement {
	private final Expression expr;

	public Semantics(Expression expr, int line) {
		super(line);
		this.expr = expr;
	}

	public void prettyPrint(Stream stream) {
		stream.print("semantics ");
		expr.prettyPrint(stream);
	}

	protected void semanticCheck() {
		expr.semanticCheck(this);
	}

	/*****************************
	* Execution
	******************************/

	public boolean execute(Program p) {
		expr.set(p);

		if(checkForErrors() == true)
			return false;

		Protocol protocol = expr.execute(p);
		Node n = protocol.graph();
		p.verbose("Printing semantics for type " + expr.id());
		p.print(n);
		p.println();
		return true;
	}
}
