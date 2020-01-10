package compiler.ast.parametrised;

import java.util.Set;
import java.util.HashSet;
import java.util.List;

import compiler.ast.expression.Parametrised;

import compiler.ast.base.Type;
import compiler.ast.base.RVariable;
import compiler.ast.base.Recursion;

public class ParametrisedContext {
	private final Set<String> visited;

	private final Parametrised parametrised;

	public ParametrisedContext(Parametrised parametrised) {
		this.parametrised = parametrised;
		visited = new HashSet<String>();
		instance = null;
	}

	private Instance instance;

	Instance instance() {
		return instance;
	}

	Type execute(String name, List<Integer> arguments) {
		Abstraction abstraction = parametrised.match(name, arguments);

		if(abstraction == null)
			return null;

		String application = name;

		for(Integer i: arguments)
			application += "_" + i;

		if(visited.contains(application))
			return new RVariable(application, -1);

		Instance tmp = instance;
		instance = new Instance(abstraction, arguments);

		visited.add(application);

		Type t = abstraction.execute(this);

		visited.remove(application);
		instance = tmp;

		return new Recursion(application, t, -1);
	}
}
