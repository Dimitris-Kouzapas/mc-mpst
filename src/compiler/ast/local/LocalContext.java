package compiler.ast.local;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

import compiler.ast.statement.Statement;
import compiler.ast.expression.ProtocolDecl;

import automata.graph.Node;
import automata.machine.LocalState;
import automata.machine.StateMachine;

import action.Action;
import action.ActionSet;

import runtime.Stream;

public final class LocalContext extends ProtocolDecl {
	private final List<RoleDecl> list;
	private final ActionSet actionSet;

	public LocalContext(String id, List<RoleDecl> list, int line) {
		super(id, line);
		this.list = list;
		this.actionSet = new ActionSet();
		set();
	}

	@Override
	public void prettyPrint(Stream stream) {
		super.prettyPrint(stream);
		stream.println("{");
		stream.pushIndent();

		boolean first = true;
		for(RoleDecl rd: list) {
			if(first == false)
				stream.println(",");
			rd.prettyPrint(stream);
			first = false;
		}

		stream.println();
		stream.popIndent();
		stream.print("}");
	}
	
	@Override
	public void ctxPrint(Stream stream) {
		boolean first = true;
		for(RoleDecl rd: list) {
			if(first == false)
				stream.println(",");
			rd.prettyPrint(stream);
			first = false;
		}
		stream.println();
	}


	@Override
	public void semanticCheck(Statement stm) {
		for(int i = 0; i < list.size(); i++) {
			RoleDecl ri = list.get(i);
			for(int j = i + 1; j < list.size(); j++) {
				RoleDecl rj = list.get(j);
				if(ri.role.equals(rj.role))
					stm.add(rj.semanticError("Role " + rj.role + " is declared twice.", stm.file()));
			}
		}

		for(RoleDecl rd: list)
			rd.semanticCheck(stm);
	}

	/*********************************
	 * Auxiliary
	 ********************************/

	@Override
	public void add(Action a) {
		actionSet.add(a);
	}

	@Override
	protected Set<String> roles() {
		Set<String> roles = new HashSet<String>();
		for(RoleDecl rd: list)
			roles.addAll(rd.roles());

		return roles;
	}

	/*************************************
	 * Override object methods
	 *************************************/

	public LocalContext clone() {
		List<RoleDecl> rdl = new ArrayList<RoleDecl>();
		for(RoleDecl rd: list)
			rdl.add(rd.clone());

		return new LocalContext(id(), rdl, line);
	}

	/*********************************
	 * AST Construction
	 ********************************/

	protected final void set() {
		for(RoleDecl rd: list)
			rd.set(this);
	}

	/*********************************
	 * Project
	 ********************************/

	@Override
	protected LocalContext project() {
		List<RoleDecl> rdl = new ArrayList<RoleDecl>();
		for(RoleDecl rd: list)
			rdl.addAll(rd.project(roles()));

		return new LocalContext("projection_" + id(), rdl, line);
	}
	
	@Override
	protected LocalContext project(Statement stm) {
		List<RoleDecl> rdl = new ArrayList<RoleDecl>();
		for(RoleDecl rd: list)
			rdl.addAll(rd.project(roles(), stm));

		return new LocalContext("projection_" + id(), rdl, line);
	}

	/*********************************
	 * Automata Translation
	 ********************************/

	public Node graph() {
		LocalState ls = new LocalState();
		for(RoleDecl rd: list)
			ls.put(rd.role, rd.type);

		return new StateMachine<Node>(ls).translate().normalise();
	}

	/*********************************
	 * Print mcrl2
	 ********************************/

/*	public void mCRL2(Stream stream) {
		new GraphMachine(translate()).mCRL2(stream);
	}

	public void mCRL2(Stream stream) {
		actions(stream);
		printmCRL2(stream);

		stream.println("proc context =");
		stream.pushIndent();
		contextProcess(stream, "P");
		stream.println(";");
		stream.popIndent();
		stream.println();

		stream.println("init context;");
	}

	public void actions(Stream stream) {
		stream.print("act ");

		boolean first = true;
		for(Action a: actionSet.single()) {
			if(first != true)
				stream.println(",");
			stream.print("\t" + a.action());
			first = false;
		}

		for(Action a: actionSet.dual()) {
			if(first != true)
				stream.println(",");
			stream.println("\t" + a.action() + ",");
			stream.println("\t" + a.dual() + ",");
			stream.print("\t" + a.globalAction());
			first = false;
		}

		stream.println(";");
		stream.println();
	}

	private void printmCRL2(Stream stream) {
		int seq = 0;
		for(RoleDecl rd: list) {
			stream.print("proc P" + seq++ + " = ");
			rd.mCRL2(stream);
			stream.println(";");
			stream.println();
		}

		for(Recursion r: recursionList) {
			stream.print("proc ");
			r.mCRL2(stream);
			stream.print(" = ");
			r.mCRL2Body(stream);
			stream.println(";\n");
		}

		seq = 0;
		stream.print("proc P = ");
		boolean first = true;
		for(RoleDecl rd: list) {
			if(first == false)
				stream.print(" || ");
			stream.print("(P" + seq++ + ")");
			first = false;
		}

		stream.println(";");
		stream.println();
	}

	public final void contextProcess(Stream stream, String process) {
		if(actionSet.single().isEmpty() == false || actionSet.dual().isEmpty() == false) {
			stream.print("allow({");
			boolean first = true;
			for(Action a: actionSet.single()) {
				if(first != true)
					stream.print(", ");
				stream.print(a.action());
				first = false;
			}

			for(Action a: actionSet.dual()) {
				if(first != true)
					stream.print(", ");
				stream.print(a.globalAction());
				first = false;
			}

			stream.print("}, ");
			stream.pushIndent();
			stream.println();
		}

		printActions(stream, "comm", actionSet.dual(), a -> a.commAction());

		stream.print(process);

		closePar(stream, actionSet.dual().isEmpty() == false);
		closePar(stream, actionSet.single().isEmpty() == false || actionSet.dual().isEmpty() == false);
	}
*/

	public LocalContext encodeParallel() {
		return this;
	}
}
