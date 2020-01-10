package compiler;

import automata.graph.Node;

public interface Protocol extends PrettyPrint {
	public String id();
	public Protocol projectionSet();
	public Node graph();
}
