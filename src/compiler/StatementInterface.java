package compiler;

import java.util.List;

import runtime.Program;

public interface StatementInterface extends PrettyPrint {
	public boolean execute(Program program);
	public List<String> errors();
}
