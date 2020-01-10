package compiler.ast.statement;

import java.util.List;
import java.util.ArrayList;

import compiler.ast.ASTNode;
import compiler.ast.ASTError;

import compiler.StatementInterface;
import runtime.Program;
import runtime.Stream;

public abstract class Statement extends ASTNode implements StatementInterface {
	private String file;

	protected Statement(int line) {
		super(line);
	}

	public final void set(String file) {
		this.file = file;
	}

	public final String file() {
		return file;
	}

	/*****************************
	* Execution Handling
	******************************/

	public abstract boolean execute(Program p);

	/*****************************
	* Error Handling
	******************************/

	private List<ASTError> errors;

	protected abstract void semanticCheck();

	private void reset() {
		errors = new ArrayList<ASTError>();
	}

	public final void add(ASTError error) {
		errors.add(error);
	}

	private final boolean hasErrors() {
		return errors.size() > 0;
	}

	public final List<String> errors() {
		List<String> errors = new ArrayList<String>();
		this.errors.forEach(n -> errors.add(n.toString()));

		return errors;
	}

	protected final boolean checkForErrors() {
		reset();
		semanticCheck();
		return hasErrors();
	}
}
