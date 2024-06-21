package compiler.ast.statement;

import compiler.Protocol;
import compiler.ast.expression.Encode;

import runtime.Program;
import runtime.Stream;

public class EncodeStatement extends Statement {
	private final Encode encode;

	public EncodeStatement(Encode encode, int line) {
		super(line);
		this.encode = encode;
	}

	public void prettyPrint(Stream stream) {
		encode.prettyPrint(stream);
	}

	protected void semanticCheck() {
		encode.semanticCheck(this);
	}

	/*****************************
	 * Execution
	 *****************************/

	public boolean execute(Program p) {
	
		encode.set(p);

		if(checkForErrors() == true)
			return false;

		p.verbose("Printing encoding for type " + encode.id());

		Protocol protocol = encode.execute(p);
		p.print(protocol);
		p.println();

		return true;
	}
}
