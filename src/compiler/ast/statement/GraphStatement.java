package compiler.ast.statement;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

import compiler.Protocol;
import compiler.ast.expression.Expression;

import automata.graph.Node;
import automata.graph.GraphMachine;

import runtime.Program;
import runtime.Stream;
import runtime.ModelChecker;

public class GraphStatement extends Statement {
	private final Expression expr;

	public GraphStatement(Expression expr, int line) {
		super(line);
		this.expr = expr;
	}

	public void prettyPrint(Stream stream) {
		stream.print("graph ");
		expr.prettyPrint(stream);
	}

	protected void semanticCheck() {
		expr.semanticCheck(this);
	}

	/*****************************
	* Execution
	******************************/

	private static final String tmpDir = "/tmp/";
	private static final File tmp = new File(tmpDir);
	private static final String createTmpFile(String name) throws IOException {
		File f = File.createTempFile(name + ".tmp.", "", tmp);
		return  tmpDir + f.getName();
	}

/*	private void printTmpFiles(Program p, Stream s1, Stream s2, String file1, String file2) {
		try {
			new Stream(file1 + ".tmp" + ModelChecker.mcrl2).print(s1.toString());
			p.verbose("Created temp file: " + file1 + ".tmp" + ModelChecker.mcrl2);
		}
		catch(FileNotFoundException e) {
			add(IOError("Cannot create tmp file " + file1 + ModelChecker.mcrl2));
			return;
		}

		try {
			new Stream(file2 + ".tmp" + ModelChecker.mcrl2).print(s2.toString());
			p.verbose("Created temp file: " + file2 + ".tmp" + ModelChecker.mcrl2);
		}
		catch(FileNotFoundException e) {
			add(IOError("Cannot create tmp file " + file2 + ModelChecker.mcrl2));
			return;
		}
	}
*/
	public boolean execute(Program p) {
		expr.set(p);

		if(checkForErrors() == true)
			return false;

		Protocol protocol = expr.execute(p);
		Node node = protocol.graph();
		p.verbose("Creating semantics graph for type " + expr.id());
		GraphMachine gm = new GraphMachine(node);

		Stream file = null;

		String filename = null;

		try {
			filename = createTmpFile(expr.id());
			p.verbose("Creating temp file: " + filename + ModelChecker.mcrl2);
		} catch(IOException e) {
			add(IOError("Cannot create file " + expr.id() + ModelChecker.mcrl2));
			return false;
		} 

		try {
			file = new Stream(filename + ModelChecker.mcrl2);
		} catch(FileNotFoundException e) {
			add(IOError("Cannot create file " + filename + ModelChecker.mcrl2));
			return false;
		}

		gm.mCRL2(file);

		try {
			ModelChecker.graph(filename);
		} catch(IOException e) {
			add(IOError("Cannot process file " + filename + ModelChecker.mcrl2));
			return false;
		} catch(InterruptedException e) {
			add(IOError("Graph creation process was interrupted"));
			return false;
		}
//		p.print(n);
//		p.println();
		return true;
	}
}
