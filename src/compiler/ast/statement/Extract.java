package compiler.ast.statement;

import java.io.FileNotFoundException;

import compiler.ProtocolModule;

import runtime.Program;
import runtime.Stream;

public class Extract extends Statement {
	private final String module;

	public Extract(String module, int line) {
		super(line);
		this.module = module;
	}

	public final String module() {
		return module;
	}

	public void prettyPrint(Stream stream) {
		stream.print("load " + module);
	}

	protected void semanticCheck() {
		return;
	}

	public final boolean execute(Program p) {
		p.verbose("Creating file " + module);
		Stream stream = null;
		try {
			stream = new Stream(module);
		}
		catch(FileNotFoundException e) {
			add(IOError("Cannot create file " + module));
			return false;
		}

		for(ProtocolModule pm: p.contexts()) {
			pm.prettyPrint(stream);
			stream.println();
			stream.println();
		}

		return true;
	}
}
