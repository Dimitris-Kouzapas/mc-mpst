package compiler.ast.statement;

import java.io.File;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;

import runtime.Program;
import runtime.Stream;

public class EnvStatement extends Statement {
	private final EnvOperation operation;
	private final String arg;

	public EnvStatement(EnvOperation operation, String arg, int line) {
		super(line);
		this.operation = operation;
		this.arg = arg;
	}

	public void prettyPrint(Stream stream) {
		stream.print(operation.op());
		stream.print(((arg != null) ? " " + arg : ""));
	}

	protected void semanticCheck() {
		return;
	}

	public boolean execute(Program p) {
		switch(operation) {
			case Usage:
				usage(p);
				break;
			case Verbose:
				p.verbose(env(!p.verbose()));
				p.println(verbose(p));
				break;
			//case Temp:
			//	p.temp(env(!p.temp()));
			//	p.println(temp(p));
			//	break;

			//case List:
			//	list(p);
			//	break;

			case History:
				history(p);
				break;

			case Exec:
			case Last:
				exec(p);
				break;

/*			case Env:
				if(arg == null)
					env(p);
				else
					switch(arg) {
						case "v":
						case "-verbose":
							p.print(verbose(p));
							break;
						case "t":
						case "-tmp":
						case "-temp":
							p.print(temp(p));
							break;
						default:
							env(p);
							break;
					}
				break;
*/
			case Clear:
				p.clear();
				break;

			case Rm:
				boolean res = p.remove(arg);
				if(res)
					p.verbose("Deleted context: " + arg);
				break;

			case Quit:
				p.quit();
				break;
		}
		return true;
	}


	/************************************
	 *	Environment operations
	 ************************************/

	private boolean env(boolean flag) {
		if(arg != null)
			switch(arg) {
				case "false":
				case "f":
				case "off":
					return false;
			//	case "true":
			//	case "t":
			//	case "on":
			//		return true;
			}
		return flag;
	}

	private static String resource(String path) {
		String data = "";
		try {
			data = new String(Files.readAllBytes(Paths.get(path)));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return data;
	}

	private void usage(Program p) {
		if(arg != null)
			switch(arg) {
				case "-check":
				case "-verify":
					p.println(resource("runtime/resources/verify.res"));
					return;

				case "-project":
					p.println(resource("runtime/resources/project.res"));
					return;

				case "-semantics":
					p.println(resource("runtime/resources/semantics.res"));
					return;

				case "-graph":
					p.println(resource("runtime/resources/graph.res"));
					return;

				case "-load":
				case "-file":
					p.println(resource("runtime/resources/load.res"));
					return;

				case "-extract":
					p.println(resource("runtime/resources/extract.res"));
					return;

				case "-list":
				case "-ls":
				case "-module":
				case "-modules":
					p.println(resource("runtime/resources/list.res"));
					return;

				case "-rm":
					p.println(resource("runtime/resources/rm.res"));
					return;

				case "-history":
				case "-hs":
					p.println(resource("runtime/resources/history.res"));
					return;

				case "-clear":
					p.println(resource("runtime/resources/clear.res"));
					return;

//				case "-temp":
//				case "-tmp":
//					p.println(resource("runtime/resources/temp.res"));
//					return;

				case "-verbose":
					p.println(resource("runtime/resources/verbose.res"));
					return;

//				case "-env":
//					p.println(resource("runtime/resources/env.res"));
//					return;

				case "-exec":
					p.println(resource("runtime/resources/exec.res"));
					break;

				case "-last":
					p.println(resource("runtime/resources/last.res"));
					return;

				case "-quit":
				case "-exit":
					p.println(resource("runtime/resources/quit.res"));
					return;
			}
			p.println(resource("runtime/resources/usage.res"));
	}

/*	private void list(Program p) {
		if(arg == null)
			for(ProtocolModule pd: p.contexts()) {
				p.println();
				p.print(pd);
				p.println();
			}
		else if(p.get(arg) == null)
			return;
		else {
			p.print(p.get(arg));
			p.println();
		}
	}
*/
	private void history(Program p) {
		int limit = (arg != null) ? p.historySize() - Integer.parseInt(arg) : 0;
		for(int i = 0; i < p.historySize(); i++)
			if(i >= limit)
				p.printHistory(i);
	}

	private void exec(Program p) {
		int index = (arg != null) ? Integer.parseInt(arg) : p.historySize();
		p.execHistory(index);
	}

/*	private void env(Program p) {
		p.println("1.     " + verbose(p));
		p.println("2.   " + temp(p));
	}
*/
	private String verbose(Program p) {
		return "Verbose mode: " + (p.verbose() ? "on" : "off");
	}

/*	private String temp(Program p) {
		return "Temp file mode: " + (p.temp() ? "on" : "off");
	}
*/}
