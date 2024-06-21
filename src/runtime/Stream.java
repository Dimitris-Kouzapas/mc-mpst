package runtime;

import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.lang.StringBuffer;

public class Stream {
	private String path;
	private PrintStream printStream;
	private StringBuffer sb;
	private PrintStream out;

	// Indent counts the number of indentations
	private int indent;
	private String indentString;
	private boolean changeLine;
	private final String indentChar = "\t";

	// The next three methods are used for controlling indentation
	public void pushIndent() {
		indent++;
		createIndentString();
	}
	public void popIndent() {
		indent--;
		createIndentString();
	}

	private void createIndentString() {
		indentString = "";
		for(int i = 0; i < indent; i++)
			indentString = indentString + indentChar;
	}

	public Stream() {
		path = null;
		out = null;
		sb = new StringBuffer();
		indent = 0;
		changeLine = true;
		createIndentString();
	}

	public Stream(String path) throws FileNotFoundException {
		this();
		printStream = new PrintStream(path);
		this.path = new String(path);
	}

	public Stream(String path, PrintStream out) throws FileNotFoundException {
		this(path);
		this.out = out;
	}

	public Stream(PrintStream out) {
		this();
		this.out = out;
	}

	public void println() {
		if (printStream != null)
			printStream.println();
		if(out != null)
			out.println();
		sb.append("\n");
		changeLine = true;
	}

	public void println(String s) {
		String is = (changeLine == true) ? indentString : "";
		if (printStream != null)
			printStream.println(is + s);
		if(out != null)
			out.println(is + s);
		sb.append(is + s + "\n");	
		changeLine = true;
	}

	public void print(String s) {
		String is = (changeLine == true) ? indentString : "";
		if (printStream != null)
			printStream.print(is + s);
		if(out != null)
			out.print(is + s);
		sb.append(is + s);
		changeLine = false;
	}

	public void printIndent(int indent) {
		for(int i = 0; i < indent; i++)
			this.print(indentChar); 
	}

	public void reset() {
		sb = new StringBuffer();
		path = null;
		out = null;
	}

	public void close() {
		if (printStream != null)
			printStream.close();
	}

	public boolean isEmpty() {
		return sb.length() == 0;
	}

	public String toString() {
		return sb.toString();
	}

}
