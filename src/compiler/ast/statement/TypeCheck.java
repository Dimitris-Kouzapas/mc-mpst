package compiler.ast.statement;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

import compiler.Protocol;
import compiler.ast.expression.Expression;
import compiler.ast.expression.Project;
import compiler.ast.expression.Encode;

import automata.graph.Node;
import automata.graph.GraphMachine;

import runtime.Program;
import runtime.Stream;
import runtime.ModelChecker;

import automata.graph.BisimulationChecker;

public class TypeCheck extends Statement {
	private final Expression expr1, expr2;
	//private final Encode encode1, encode2;
	private boolean projected;

	public TypeCheck(Expression expr1, Expression expr2, int line) {
		super(line);
		this.expr1 = expr1;
		this.expr2 = expr2;
		//this.encode1 = new Encode(expr1, line);
		//this.encode2 = new Encode(expr2, line);
		projected = false;
	}

	public TypeCheck(Expression expr, int line) {
		this(TypeCheck.checkEncode(expr), new Project(expr, line), line);
		projected = true;
	}
	
	private static Expression checkEncode(Expression expr) {
		return new Encode(expr, 0);
	}

	public void prettyPrint(Stream stream) {
		stream.print("check ");
		this.expr1.prettyPrint(stream);
		stream.print(" == ");
		this.expr2.prettyPrint(stream);
	}

	protected void semanticCheck() {
		this.expr1.semanticCheck(this);
		this.expr2.semanticCheck(this);
	}

	public boolean execute(Program p) {
		expr1.set(p);
		expr2.set(p);

		if(checkForErrors() == true)
			return false;

		//equivalence(p);

		Protocol protocol1 = expr1.execute(p);
		Protocol protocol2 = expr2.execute(p);

		String id1 = protocol1.id();
		String id2 = protocol2.id();

		Node node1 = protocol1.graph();
		Node node2 = protocol2.graph();

		p.verbose("Creating semantics graph for type " + id1);
		p.verbose("Creating semantics graph for type " + id2);
		GraphMachine gm1 = new GraphMachine(node1);
		GraphMachine gm2 = new GraphMachine(node2);

		Stream file1 = null;
		Stream file2 = null;

		String filename1 = null, filename2 = null;

		try {
			filename1 = ModelChecker.createTmpFile(id1);
			p.verbose("Creating temp file: " + filename1 + ModelChecker.mcrl2);
		} catch(IOException e) {
			add(IOError("Cannot create file " + id1 + ModelChecker.mcrl2));
			return false;
		}
		try {
			filename2 = ModelChecker.createTmpFile(id2);
			p.verbose("Creating temp file: " + filename2 + ModelChecker.mcrl2);
		} catch(IOException e) {
			add(IOError("Cannot create file " + id2 + ModelChecker.mcrl2));
			return false;
		}

		try {
			file1 = new Stream(filename1 + ModelChecker.mcrl2);
		} catch(FileNotFoundException e) {
			add(IOError("Cannot create file " + filename1 + ModelChecker.mcrl2));
			return false;
		}
		
		try {
			file2 = new Stream(filename2 + ModelChecker.mcrl2);
		} catch(FileNotFoundException e) {
			add(IOError("Cannot create file " + filename2 + ModelChecker.mcrl2));
			return false;
		}

		gm1.mCRL2(file1);
		gm2.mCRL2(file2);

		String result = null;
		try {
			result = ModelChecker.bisimulationCheck(filename1, filename2); 
		} catch(IOException e) {
			add(IOError("Cannot process types " + id1 + " and " + id2 + ModelChecker.mcrl2));
			return false;
		} catch(InterruptedException e) {
			add(IOError("Bisimulation check process was interrupted"));
			return false;
		}
		p.println("Checking protocols: " + id1 + " and " + id2 + ".");
		p.println(result);

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
