package compiler.ast.statement;

import java.io.FileNotFoundException;

import compiler.ProtocolModule;
import compiler.ast.expression.IDExpression;

import runtime.Program;
import runtime.Stream;

public class Extract extends Statement {
	private final IDExpression expr;
	private final String module;

	public Extract(IDExpression expr, String module, int line) {
		super(line);
		this.expr = expr;
		this.module = module;
	}

	public final String module() {
		return module;
	}

	public void prettyPrint(Stream stream) {
		stream.print("extract");
		if (expr != null) {
			stream.print(" ");
			expr.prettyPrint(stream);
		}
		stream.print(" " + module);
	}

	protected void semanticCheck() {
        expr.semanticCheck(this);
	}

	public final boolean execute(Program p) {
		expr.set(p);

		if(checkForErrors() == true)
			return false;

		p.verbose("Creating file " + module);
		Stream stream = null;
		try {
			stream = new Stream(module);
		}
		catch(FileNotFoundException e) {
			add(IOError("Cannot create file " + module));
			return false;
		}

		if (expr == null) {
			for(ProtocolModule pm: p.contexts()) {
				pm.prettyPrint(stream);
				stream.println();
				stream.println();
			}
		}
		else {
			ProtocolModule pm = p.get(expr.toString());
			pm.ctxPrint(stream);
			stream.println();
		}

		return true;
	}
}
