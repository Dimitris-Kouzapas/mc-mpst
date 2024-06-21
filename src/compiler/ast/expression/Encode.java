package compiler.ast.expression;

import compiler.Protocol;
import compiler.ast.statement.Statement;

import runtime.Program;
import runtime.Stream;

public class Encode extends Expression {
	private Expression expr;

	public Encode(Expression expr, int line) {
		super(line);
		this.expr = expr;
	}

	@Override
	public void prettyPrint(Stream stream) {
		stream.print("encode ");
		expr.prettyPrint(stream);
	}

	@Override
	public void semanticCheck(Statement stm) {
		expr.set(p);
		expr.semanticCheck(stm);
		if(stm.hasErrors() == true)
			return;
		
		Protocol protocol = expr.execute(p);
		if(protocol.encodeParallel() == null)
			stm.add(translationError("The following type cannot be translated into an equivalent type with a finite state space:\n" + protocol.toString(), stm.file()));
	}

	/*************************************
	 * Execute
	 *************************************/

	@Override
	public Protocol execute(Program p) {
		//expr.set(p);

		//if(checkForErrors() == true)
		//	return false;
		p.verbose("Encoding type " + expr.id());
		return expr.execute(p).encodeParallel();
	}

	@Override
	public String id() {
		return "encode_" + expr.id();
	}
}
