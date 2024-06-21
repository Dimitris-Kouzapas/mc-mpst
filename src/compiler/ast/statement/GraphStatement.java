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
	private final String filename;

	public GraphStatement(Expression expr, String filename, int line) {
		super(line);
		this.filename = filename;
		this.expr = expr;
	}

	public void prettyPrint(Stream stream) {
		stream.print("graph ");
		expr.prettyPrint(stream);
		stream.print(" " + filename);
	}

	protected void semanticCheck() {
		expr.semanticCheck(this);
	}

	/*****************************
	* Execution
	******************************/

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

		String tmp_filename = null;
		//String filename = null;

		try {
			tmp_filename = ModelChecker.createTmpFile(expr.id());
			//filename = expr.id();
			p.verbose("Creating temp file: " + filename + ModelChecker.mcrl2);
		} catch(IOException e) {
			add(IOError("Cannot create file " + expr.id() + ModelChecker.mcrl2));
			return false;
		}

		try {
			file = new Stream(tmp_filename + ModelChecker.mcrl2);
		} catch(FileNotFoundException e) {
			add(IOError("Cannot create file " + filename + ModelChecker.mcrl2));
			return false;
		}

		gm.mCRL2(file);

		try {
			//ModelChecker.graph(filename);
			ModelChecker.lps(tmp_filename);
			ModelChecker.lts(tmp_filename, filename);
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
