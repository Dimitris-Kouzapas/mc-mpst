package compiler.ast.statement;

import runtime.Program;
import runtime.Stream;

public class PrintModule extends Statement {
	private final String module;

	public PrintModule(int line) {
		this(null, line);
	}

	public PrintModule(String module, int line) {
		super(line);
		this.module = module;
	}

	public void prettyPrint(Stream stream) {
		if(module != null)
			stream.print("module " + module);
		else
			stream.print("modules");
	}

	protected void semanticCheck() {
		return;
	}

	/*****************************
	 * Execution
	 *****************************/

	public boolean execute(Program p) {
		if(checkForErrors() == true)
			return false;


		if(module == null)
			p.printModules();
		else
			p.printModule(module);

		return true;
	}
}
