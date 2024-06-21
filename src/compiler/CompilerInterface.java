package compiler;

import java.util.List;

import org.antlr.v4.runtime.CharStream;

public interface CompilerInterface {
	public List<StatementInterface> compile(CharStream in, String file);
}
