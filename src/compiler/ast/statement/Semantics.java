package compiler.ast.statement;

import compiler.Protocol;
import compiler.ast.expression.Expression;
import compiler.ast.expression.Encode;

import automata.graph.Node;

import runtime.Program;
import runtime.Stream;

public class Semantics extends Statement {
	private final Expression expr;
	//private final Encode encode;

	public Semantics(Expression expr, int line) {
		super(line);
		this.expr = expr;
		//this.encode = new Encode(expr, line);
	}

	public void prettyPrint(Stream stream) {
		stream.print("semantics ");
		this.expr.prettyPrint(stream);
	}

	protected void semanticCheck() {
		//this.encode.semanticCheck(this);
		expr.semanticCheck(this);
	}

	/*****************************
	* Execution
	******************************/

	public boolean execute(Program p) {
		//this.encode.set(p);
		this.expr.set(p);
		if(checkForErrors() == true)
			return false;

		//Protocol protocol = this.encode.execute(p);
		Protocol protocol = this.expr.execute(p);
		p.println();
		Node n = protocol.graph();
		p.verbose("Printing semantics for type " + this.expr.id());
		p.print(n);
		p.println();
		return true;
	}
}
