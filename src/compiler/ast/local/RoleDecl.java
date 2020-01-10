package compiler.ast.local;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

import compiler.ast.ASTNode;
import compiler.ast.base.TypeDecl;
import compiler.ast.base.Type;

import runtime.Stream;

public class RoleDecl extends TypeDecl {
	final String role;

	public RoleDecl(String role, Type type, int line) {
		super(type, line);
		this.role = role;
		set(role);
	}

	@Override
	public void prettyPrint(Stream stream) {
		stream.print(role + ": ");
		super.prettyPrint(stream);
	}

	/*********************************
	 * Auxiliary
	 ********************************/

	@Override
	public Set<String> roles() {
		Set<String> t = new HashSet<String>();
		t.add(role);
		return t;
	}

	/*********************************
	 * Object Copy
	 ********************************/

	@Override
	public RoleDecl clone() {
		return new RoleDecl(role, type.clone(), line);
	}

	/*****************************
	* Projection
	******************************/

	@Override
	public List<RoleDecl> project(Set<String> roles) {
		List<RoleDecl> rdl = new ArrayList<RoleDecl>();

		for(String r: roles)
			if(role.equals(r) == false)
				rdl.add(new RoleDecl(role + "[" + r + "]", project(r), line));

		return rdl;
	}
}



