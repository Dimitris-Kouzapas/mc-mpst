package compiler;

import compiler.ast.statement.Statement;
import automata.graph.Node;

public interface Protocol extends PrettyPrint {
	public String id();
	public Protocol projectionSet();
	public Protocol projectionSet(Statement stm);
	public Node graph();

	public Protocol encodeParallel();
}
