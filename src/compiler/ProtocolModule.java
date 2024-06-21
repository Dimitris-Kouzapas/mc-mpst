package compiler;

import runtime.Program;
import runtime.Stream;

public interface ProtocolModule extends PrettyPrint {
	public Protocol execute(Program program);
	public void ctxPrint(Stream stream);
}
