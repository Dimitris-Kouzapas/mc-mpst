package compiler;

import runtime.Program;

public interface ProtocolModule extends PrettyPrint {
	public Protocol execute(Program program);
}
