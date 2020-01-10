package compiler.ast.statement;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

import compiler.Protocol;
import compiler.ast.expression.Expression;
import compiler.ast.expression.Project;



import runtime.Program;
import runtime.Stream;
import runtime.ModelChecker;

import automata.graph.BisimulationChecker;

public class TypeCheck extends Statement {
	private final Expression expr1, expr2;
	private boolean projected;

	public TypeCheck(Expression expr1, Expression expr2, int line) {
		super(line);
		this.expr1 = expr1;
		this.expr2 = expr2;
		projected = false;
	}

	public TypeCheck(Expression expr, int line) {
		this(expr, new Project(expr, line), line);
		projected = true;
	}

	public void prettyPrint(Stream stream) {
		stream.print("check ");
		expr1.prettyPrint(stream);
		stream.print(" == ");
		expr2.prettyPrint(stream);
	}

	protected void semanticCheck() {
		expr1.semanticCheck(this);
		expr2.semanticCheck(this);
	}

	public boolean execute(Program p) {
		expr1.set(p);
		expr2.set(p);

		if(checkForErrors() == true)
			return false;

		equivalence(p);
		return true;
	}

	/************************************
	 *	Equivalence
	 ************************************/

	private void equivalence(Program p) {
		Protocol protocol1 = expr1.execute(p);
		Protocol protocol2 = expr2.execute(p);

		String id1 = protocol1.id();
		String id2 = protocol2.id();

		BisimulationChecker bc = new BisimulationChecker(protocol1.graph(), protocol2.graph());

		p.verbose("Checking type equivalence: " + this);

		//boolean check = (projected == true) ? bc.simulation() : bc.bisimulation();
		boolean check = bc.bisimulation();
		if(check == true)
			p.println("Type "+ id1 + " is equivalent with type " + id2);
		else
			p.println("Type "+ id1 + " is not equivalent with type " + id2);
	}

/*	private static final String tmpDir = "/tmp/";
	private static final File tmp = new File(tmpDir);
	private final String createTmpFile(String name) throws IOException {
		File f = File.createTempFile(name + ".tmp.", "", tmp);
		return  tmpDir + f.getName();
	}

	private void printTmpFiles(Program p, Stream s1, Stream s2, String file1, String file2) {
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

	private String equivalence(String file1, String file2) {
		String output = null;

		try {
			output = ModelChecker.Strong.bisimulationCheck(file1, file2);
		}
		catch(IOException e) {
			add(IOError("Cannot open files " + file1 + " and " + file2));
			return null;
		}
		catch(InterruptedException e) {
			add(IOError("Bisimulation Checking process was interrupted"));
			return null;
		}

		return output;
	}

	private boolean equivalence(Program p) {
		String file1 = null, file2 = null;

		Stream s1, s2;

		ProtocolDecl pd1 = expr1.execute(p);
		ProtocolDecl pd2 = expr2.execute(p);

		String id1 = pd1.id();
		String id2 = pd2.id();

		try {
			file1 = createTmpFile(id1);
			s1 = new Stream(file1 + ModelChecker.mcrl2);
		}
		catch(IOException e) {
			add(IOError("Cannot create tmp file " + id1 + ModelChecker.mcrl2));
			return false;
		}

		try {
			file2 = createTmpFile(id2);
			s2 = new Stream(file2 + ModelChecker.mcrl2);
		}
		catch(IOException e) {
			add(IOError("Cannot create tmp file " + id2 + ModelChecker.mcrl2));
			return false;
		}

		pd1.mCRL2(s1);
		pd2.mCRL2(s2);

		p.verbose("Executing: " + this);

		String output = equivalence(file1, file2);

		if(output != null)
			p.printTab(output);

		if(p.temp() == true)
			printTmpFiles(p, s1, s2, id1, id2);

		return true;
	}
*/
}
