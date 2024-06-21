package compiler.ast.statement;

import compiler.ast.expression.ProtocolDecl;

import runtime.Program;
import runtime.Stream;

public class DeclStatement extends Statement {
	private final ProtocolDecl pdecl;

	public DeclStatement(ProtocolDecl pdecl, int line) {
		super(line);
		this.pdecl = pdecl;
	}

	public void prettyPrint(Stream stream) {
		pdecl.prettyPrint(stream);
	}

	protected void semanticCheck() {
		pdecl.semanticCheck(this);
	}

	/*****************************
	 * Execution
	 *****************************/

	public boolean execute(Program p) {
		pdecl.set(p);

		if(checkForErrors() == true)
			return false;

		p.verbose("Loading protocol module " + pdecl.id());
		p.put(pdecl.id(), pdecl);

		return true;
	}
}
