package compiler.ast.parametrised;

import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

import compiler.ast.parametrised.expr.Expr;
import compiler.ast.parametrised.expr.VarExpr;

public class Instance {
	private final Abstraction abstraction;
	private final Map<String, Integer> map;

	Instance(Abstraction abstraction, List<Integer> arguments) {
		this.abstraction = abstraction;
		map = new LinkedHashMap<String, Integer>();
		int i = 0;
		for(Expr expr: abstraction.parameters()) {
			if(expr instanceof VarExpr)
				map.put(((VarExpr) expr).var(), arguments.get(i));
			i++;
		}
	}

	public int valueof(String target) {
		return map.get(target);
	}
}
