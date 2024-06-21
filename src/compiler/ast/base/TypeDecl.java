package compiler.ast.base;

import java.util.Set;
import java.util.List;
import java.util.ArrayList;

import compiler.ast.ASTNode;

import compiler.ast.statement.Statement;
import compiler.ast.expression.ProtocolDecl;

import compiler.ast.base.Type;
import compiler.ast.local.RoleDecl;

import runtime.Stream;

public class TypeDecl extends ASTNode {
	//TODO change it back to private
	public final Type type;

	public TypeDecl(Type type, int line) {
		super(line);
		this.type = type;
	}

	public void semanticCheck(Statement stm) {
		type.semanticCheck(stm);
	}

	@Override
	public void prettyPrint(Stream stream) {
		type.prettyPrint(stream);
	}

	/*********************************
	 * Auxiliary
	 ********************************/

	public Set<String> roles() {
		return type.getRoles();
	}

	/*********************************
	 * Object Copy
	 ********************************/

	@Override
	public TypeDecl clone() {
		return new TypeDecl(type.clone(), line);
	}

	/*********************************
	 * AST Construction
	 ********************************/

	public final void set(ProtocolDecl pd) {
		type.set(pd);
	}

	public final void set(String role) {
		type.set(role);
	}

	/*****************************
	* Projection
	******************************/

	protected final Type project(String role) {
		return type.project(role);
	}
	
	protected final Type project(String role, Statement stm) {
		return type.project(role, stm);
	}

	public List<RoleDecl> project(Set<String> roles) {
		List<RoleDecl> rdl = new ArrayList<RoleDecl>();
		for(String role: roles())
			rdl.add(new RoleDecl(role, project(role), line));
		return rdl;
	}
	
	public List<RoleDecl> project(Set<String> roles, Statement stm) {
		List<RoleDecl> rdl = new ArrayList<RoleDecl>();
		for(String role: roles())
			rdl.add(new RoleDecl(role, project(role, stm), line));
		return rdl;
	}

	/*****************************
	* Semantic encoding
	******************************/
	
	public TypeDecl encodeParallel() {
		Type tmp = type.encodeParallel();
		if(tmp == null)
			return null;
		return new TypeDecl(tmp, line);
	}
}



