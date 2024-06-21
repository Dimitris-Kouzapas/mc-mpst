package action;

import compiler.ast.base.Type;
import compiler.ast.global.GlobalPass;

public class ErrorAction extends PassAction {
	private static String eload = "_e_error";

	public ErrorAction(String from, String to) {
		super(from, to, "error");
	}

	@Override
	public String toString() {
		return from + symbol() + to + ":" + eload;
	}

	//@Override
	//public boolean dependency(Action a) {
	//	return (a instanceof PassAction) && hasRole(a);
	//}

	/*************************************
	 * Equality functions
	 *************************************/

	@Override
	public boolean equals(Object o) {
		return (o instanceof ErrorAction) && equalField((Action) o);
	}

	//@Override
	//boolean dualOf(Action a) {
	//	return false;
	//}

	@Override
	boolean isOf(Action a) {
		return (a instanceof ErrorAction) && equalField(a);
	}

	/*************************************
	 * Action String
	 *************************************/

	@Override
	String printAction(String op) {
		return from + "_" + op + "_" + to + eload;
	}

	/*************************************
	 * Create Type
	 *************************************/

	@Override
	public GlobalPass create(Type type) {
		return new GlobalPass(from, to, eload, type, this, -1);
	}
}
