package compiler.ast.expression;

import java.util.Set;

import compiler.Protocol;
import compiler.ProtocolModule;
import compiler.ast.statement.Statement;

import automata.graph.Node;
import automata.graph.GraphMachine;

import action.Action;
import runtime.Program;
import runtime.Stream;

public abstract class ProtocolDecl extends Expression implements ProtocolModule, Protocol {
	private final String id;

	protected ProtocolDecl(String id, int line) {
		super(line);
		this.id = id;
	}

//	public final void rename(String id) {
//		this.id = id;
//	}

	@Override
	public void prettyPrint(Stream stream) {
		stream.print(id + " = ");
	}

	/*************************************
	 * Auxiliary
	 *************************************/

	protected abstract Set<String> roles();

	private Set<String> roles = null;
	protected final Set<String> getRoles() {
		if(roles == null)
			roles = roles();
		return roles;
	}

	public final boolean has(String role) {
		return getRoles().contains(role);
	}

	/*************************************
	 * Override object methods
	 *************************************/

	@Override
	public abstract ProtocolDecl clone();

	/*************************************
	 * AST Construction
	 *************************************/

	protected abstract void set();
	public abstract void add(Action a);

	/*************************************
	 * Execute
	 *************************************/

	@Override
	public abstract void semanticCheck(Statement stm);

	@Override
	public final ProtocolDecl execute(Program p) {
		//TODO create a protocol
		p.verbose("Reading type " + id());
		return this;
	}

	@Override
	public final String id() {
		return id;
	}

	/*****************************
	* Projection
	******************************/

	protected abstract ProtocolDecl project();

	private ProtocolDecl projectionSet = null;
	public final ProtocolDecl projectionSet() {
		if(projectionSet == null)
			projectionSet = project();

		return projectionSet;
	}

	/*****************************
	* Automata translation
	******************************/

	public abstract Node graph();

	/*****************************
	* Print mCRL2
	******************************/

	public final void mCRL2(Stream stream) {
		new GraphMachine(graph()).mCRL2(stream);
	}
}
