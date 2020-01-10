package compiler.ast.statement;

import compiler.ast.expression.Parametrised;
import compiler.ast.expression.ProtocolDecl;

import runtime.Program;
import runtime.Stream;

public class ParametrisedStatement extends Statement {
	private final Parametrised parametrised;

	public ParametrisedStatement(Parametrised parametrised, int line) {
		super(line);
		this.parametrised = parametrised;
	}

	public void prettyPrint(Stream stream) {
		parametrised.prettyPrint(stream);
	}

	protected void semanticCheck() {
		parametrised.semanticCheck(this);
	}

	/*****************************
	* Execution
	******************************/

	public boolean execute(Program p) {
		parametrised.set(p);

		if(checkForErrors() == true)
			return false;

		ProtocolDecl pdecl = parametrised.execute(p);
		if(pdecl == null) {
			add(semanticError("Cannot create type due to unmatched application", file()));
			return false;
		}

		p.put(pdecl.id(), pdecl);

		return true;
	}
}
