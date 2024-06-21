package compiler.ast.statement;

import compiler.Protocol;
import compiler.ast.expression.Project;

import runtime.Program;
import runtime.Stream;

public class ProjectStatement extends Statement {
	private final Project project;

	public ProjectStatement(Project project, int line) {
		super(line);
		this.project = project;
	}

	public void prettyPrint(Stream stream) {
		project.prettyPrint(stream);
	}

	protected void semanticCheck() {
		project.semanticCheck(this);
	}

	/*****************************
	 * Execution
	 *****************************/

	public boolean execute(Program p) {
		project.set(p);

		if(checkForErrors() == true)
			return false;

		Protocol protocol = project.execute(p);
		p.print(protocol);
		p.println();
		return true;
	}
}
