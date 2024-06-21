package compiler.ast.expression;

import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

import runtime.Program;
import runtime.Stream;

import compiler.ast.statement.Statement;

import compiler.ast.parametrised.IApplication;
import compiler.ast.parametrised.Abstraction;
import compiler.ast.parametrised.ParametrisedContext;

import compiler.ast.base.TypeDecl;
import compiler.ast.base.Type;
import compiler.ast.global.GlobalProtocol;

public class Parametrised extends Expression {
	private final String id;
	private final IApplication app;
	private final List<Abstraction> abstractions;

	public Parametrised(String id, IApplication app, List<Abstraction> abstractions, int line) {
		super(line);
		this.id = id;
		this.app = app;
		this.abstractions = abstractions;
	}

	@Override
	public void prettyPrint(Stream stream) {
		stream.println("def");
		stream.pushIndent();
		for(Abstraction a: abstractions) {
			a.prettyPrint(stream);
			stream.println();
		}
		stream.popIndent();
		stream.println("in");
		stream.pushIndent();
		stream.print(id + " = ");
		app.prettyPrint(stream);
		stream.popIndent();
	}

	@Override
	public void semanticCheck(Statement stm) {
		for(Abstraction abstraction: abstractions)
			abstraction.semanticCheck(stm, this);
		app.semanticCheck(stm, this);
	}

	public Abstraction match(String name, List<Integer> arguments) {
		for(Abstraction a: abstractions) {
			if(a.match(name, arguments))
				return a;
		}
		return null;
	}

	public boolean match(String name, int argsize) {
		for(Abstraction a: abstractions) {
			if(a.match(name, argsize))
				return true;
		}
		return false;
	}

	private ParametrisedContext context() {
		return new ParametrisedContext(this);
	}

	@Override
	public GlobalProtocol execute(Program p) {
		Type type = app.execute(context());
		if(type == null)
			return null;
		return new GlobalProtocol(id, new TypeDecl(type.normalise(), line), line);
	}

	public String id() {
		return id;
	}
}
