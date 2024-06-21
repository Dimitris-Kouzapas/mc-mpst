package compiler.ast.statement;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import runtime.Program;
import runtime.Stream;

public class Load extends Statement {
	private final String module;

	public Load(String module, int line) {
		super(line);
		this.module = module;
	}

	public final String module() {
		return module;
	}

	private static final String suffix = ".mc";

	public void prettyPrint(Stream stream) {
		stream.print("load " + module);
	}

	protected void semanticCheck() {
		if(new File(module).exists() == false)
			add(semanticError("File " + module + " not found.", file()));
		else if(module.endsWith(suffix) == false)
			add(semanticError("File " + module + " should have suffix " + suffix, file()));
	}

	public final boolean execute(Program p) {
		if(checkForErrors() == true)
			return false;

		p.verbose("Reading file: " + module);

		CharStream in = null;
		try {
			in = CharStreams.fromFileName(module);
		}
		catch(IOException e) {
			add(IOError("Cannot open file " + module));
			return false;
		}

		p.verbose("Compiling file: " + module);
		p.compile(in, module);
		p.verbose("Loading file: " + module);

		return true;
	}
}
