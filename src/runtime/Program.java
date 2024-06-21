package runtime;

import java.util.Set;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

import java.util.Scanner;

import java.io.PrintStream;
import java.io.InputStream;

//Something needs to be done for CharStream -> it should only be seen by the compiler
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import compiler.CompilerInterface;
import compiler.StatementInterface;
import compiler.Protocol;
import compiler.ProtocolModule;
import compiler.PrettyPrint;

import automata.graph.Node;

public class Program {
	private static final String clear = "\033[H\033[2J";

	private final CompilerInterface compiler;
	private final Linker linker;
	private List<StatementInterface> execQueue;
	private final List<StatementInterface> history;

	private boolean verbose, quit;

	private static final InputStream in = System.in;
	private static final PrintStream out = System.out;
	private static final PrintStream err = System.err;

	public Program(CompilerInterface compiler) {
		this.compiler = compiler;
		this.linker = new Linker();
		this.execQueue = new LinkedList<StatementInterface>();
		this.history = new ArrayList<StatementInterface>();

		verbose = false;
		quit = false;
	}

	public void compile(CharStream in, String file) {
		List<StatementInterface> list = compiler.compile(in, file);
		list.addAll(execQueue);
		execQueue = list;
		//execQueue.addAll(list);
	}

	private void compileString(String line) {
		CharStream in = CharStreams.fromString(line);
		compile(in, null);
	}

	/**************************************
	 *	Linker
	 **************************************/

	public Iterable<ProtocolModule> contexts() {
		return linker.get();
	}

	public void put(String key, ProtocolModule cd) {
		linker.put(key, cd);
	}

	public ProtocolModule get(String key) {
		return linker.get(key);
	}

	public boolean remove(String key) {
		return linker.remove(key);
	}

	public void printModules() {
		for(ProtocolModule module: linker.get()) {
			print(module);
			println();
		}
	}

	public void printModule(String arg) {
		ProtocolModule module = (arg != null) ? linker.get(arg) : null;
		if(module != null) {
			print(module);
			println();
		}
	}

	/**************************************
	 *	History	 List
	 **************************************/

	public int historySize() {
		return history.size();
	}

	public void execHistory(int i) {
		if(i < history.size())
			execQueue.add(history.get(i));
	}

	/************************************
	 *	Env Access
	 ************************************/

	public static void clear() {
		out.println(clear);
		out.flush();
	}

	public void verbose(boolean mode) {
		verbose = mode;
	}

	public boolean verbose() {
		return verbose;
	}

	public void quit() {
		quit = true;
	}

	/************************************
	 *	Printing
	 ************************************/

	private Stream stream;

	private void resetOutput() {
		stream = new Stream();
	}

	private final boolean hasOutput() {
		return stream.isEmpty() == false;
	}

	private final String output() {
		return stream.toString();
	}

	/** Printing interface **/
	public final void print(String msg) {
		stream.pushIndent();
		stream.print(msg);
		stream.popIndent();
	}
	public final void println(String msg) {
		print(msg);
		stream.println();
	}

	public final void println() {
		stream.println();
	}

	public final void print(PrettyPrint node) {
		stream.pushIndent();
		node.prettyPrint(stream);
		stream.popIndent();
	}

	public final void printHistory(int index) {
		println();
		stream.print(index + ".\t");
		print(history.get(index));
		println();
	}

	public final void verbose(String msg) {
		if(verbose)
			stream.println("[" + msg + "]");
	}

	/************************************
	 *	Execute
	 ************************************/

	private void execute() {
		while(!execQueue.isEmpty() && !quit) {
			StatementInterface stm = execQueue.remove(0);
			resetOutput();
			boolean r = stm.execute(this);

			if(r == false) {
				err.println();
				for(String error: stm.errors()) {
					err.println(error);
					err.println();
				}
			}
			else if(hasOutput())
				out.print(output());

			history.add(stm);
		}
	}

	public void execute(String inp) {
		compileString(inp);
		execute();
	}

	public void terminal() {
		Scanner scan = new Scanner(in);
		String line;
		execute();
		while(!quit) {
			out.print(">: ");
			line = scan.nextLine();
			execute(line);
		}
	}
}
