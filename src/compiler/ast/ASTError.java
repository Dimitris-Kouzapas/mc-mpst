package compiler.ast;

public class ASTError {
	private final int line;
	private final String type, error;
	private final String file;

	ASTError(String type, String error, String file, int line) {
		this.type = type;
		this.error = error;
		this.file = file;
		this.line = line;
	}

	ASTError(String type, String error) {
		this(type, error, null, -1);
	}

	private static String format(String line1, String line2) {
		return line1 + "\n\t\t" + line2;
	}

	public String toString() {
		return (file != null)	? format(type + " in " + file + ": line " + line, error)
					: format(type, error);
	}
}
