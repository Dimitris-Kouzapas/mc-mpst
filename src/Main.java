import runtime.Program;
import compiler.Compiler;

//import automata.machine.MultiGlobal;

public class Main {
	private static Program r = new Program(new Compiler());

	private static boolean terminal = true;

	public static void main(String[] args) {
		process(args);
		if(terminal == true)
			r.terminal();
	}


	private static void process(String[] args) {
		if(args.length > 0)
			terminal = false;

		for(int i = 0; i < args.length; i++) {
			String a = args[i];
			switch(a) {
				case "-t":
				case "-trm":
				case "-term":
					terminal = true;
					break;

				case "-c":
				case "-cmd":
				case "-command":
					i++;
					if(i < args.length)
						r.execute(args[i]);
					break;

				default:
					r.execute(createCommand(args, i));
					i = args.length;
					break;
			}
		}
	}

	private static String createCommand(String[] args, int index) {
		String s = "";
		for(int i = index; i < args.length; i++) {
			s += (i != index) ? " " : "";
			s += args[i];
		}
		return s;
	}
}
