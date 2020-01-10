package compiler.ast;

import runtime.Stream;

public abstract class ASTNode {
	protected final int line;

	protected ASTNode(int line) {
		this.line = line;
	}

	public abstract void prettyPrint(Stream stream);

	public final Stream prettyPrint() {
		Stream stream = new Stream();
		prettyPrint(stream);
		return stream;
	}

	public final String toString() {
		return prettyPrint().toString();
	}

	public final ASTError semanticError(String error, String file) {
		return new ASTError("Semantic Error", error, file, line);
	}

	protected static final ASTError inputError(String error) {
		return new ASTError("Input Error", error);
	}

	protected static final ASTError IOError(String error) {
		return new ASTError("Input/Output Error", error);
	}

	protected final ASTError inputError(String error, String file) {
		return new ASTError("Input Error", error, file, line);
	}
}
