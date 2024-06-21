package compiler.ast.global;

import java.util.Set;
import java.util.HashSet;
import java.util.List;

import compiler.ast.statement.Statement;

import compiler.ast.expression.ProtocolDecl;
import compiler.ast.base.TypeDecl;
import compiler.ast.base.Type;
import compiler.ast.local.LocalContext;
import compiler.ast.local.RoleDecl;

import automata.graph.Node;

import automata.machine.GlobalState;
import automata.machine.StateMachine;

import action.Action;
import runtime.Stream;

public class GlobalProtocol extends ProtocolDecl {
	private final Set<Action> actionSet;
	private final TypeDecl td;

	public GlobalProtocol(String id, TypeDecl td, int line) {
		super(id, line);
		this.td = td;
		actionSet = new HashSet<Action>();
		set();
	}

	@Override
	public void prettyPrint(Stream stream) {
		super.prettyPrint(stream);
		td.prettyPrint(stream);
	}

	@Override
	public void ctxPrint(Stream stream) {
		prettyPrint(stream);
	}

	@Override
	public void semanticCheck(Statement stm) {
		td.semanticCheck(stm);
	}

	/*************************************
	 * Override object methods
	 *************************************/

	@Override
	public GlobalProtocol clone() {
		return new GlobalProtocol(id(), td.clone(), line);
	}

	/*********************************
	 * AST Construction
	 ********************************/

	@Override
	public final void add(Action a) {
		actionSet.add(a);
	}

	@Override
	protected final void set() {
		td.set(this);
	}

	/*********************************
	 * Auxiliary
	 ********************************/

	@Override
	protected Set<String> roles() {
		return td.roles();
	}

	/*********************************
	 * Project
	 ********************************/

	@Override
	protected LocalContext project() {
		List<RoleDecl> rdl = td.project(roles());
		return new LocalContext("projection_" + id(), rdl, line);
	}
	
	@Override
	protected LocalContext project(Statement stm) {
		List<RoleDecl> rdl = td.project(roles(), stm);
		return new LocalContext("projection_" + id(), rdl, line);
	}

	/*********************************
	 * Automata translation
	 ********************************/

	public Node graph() {
		return new StateMachine<Node>(new GlobalState(td.type)).translate().normalise();
	}

	/*********************************
	 * mcrl2 Print
	 ********************************/

/*	public void mCRL2(Stream stream) {
		new GraphMachine(translate()).mCRL2(stream);
	}

	@Override
	public void actions(Stream stream) {
		stream.print("act");

		boolean first = true;
		for(Action a: actionSet) {
			if(first != true)
				stream.println(",");
			stream.print("\t" + a.action());
			first = false;
		}
		stream.println(";\n");
	}

	@Override
	public void contextProcess(Stream stream, String process) {
		stream.print(process);
	}
*/

	/*****************************
	* Semantic encoding
	******************************/

	private GlobalProtocol encoded = null;
	public GlobalProtocol encodeParallel() {
		if(encoded == null) {
			TypeDecl tmp = td.encodeParallel();
			if(tmp == null)
				return null;
			encoded = new GlobalProtocol("translation_" + id(), tmp, line);
		}
		return encoded;
	}
}
