package action;

import compiler.ast.base.Type;
import compiler.ast.base.Pass;
import compiler.ast.global.GlobalPass;

public class PassAction extends Action {
	public PassAction(String from, String to, String load) {
		super(from, to, load);
	}

	@Override
	String symbol() {
		return "->";
	}

	@Override
	public String toString() {
		return from + symbol() + to + ":" + load();
	}

	@Override
	public boolean dependency(Action a) {
		return (a instanceof PassAction) && hasRole(a);
	}

	/*************************************
	 * Equality functions
	 *************************************/

	@Override
	public boolean equals(Object o) {
		return (o instanceof PassAction) && equalField((Action) o);
	}

	@Override
	boolean dualOf(Action a) {
		return false;
	}

	@Override
	boolean isOf(Action a) {
		return (a instanceof PassAction) && equalField(a);
	}

	/*************************************
	 * Action String
	 *************************************/

	@Override
	public String senderAction() {
		return printAction("send");
	}

	@Override
	public String receiverAction() {
		return printAction("recv");
	}

	@Override
	public String globalAction() {
		return printAction("pass");
	}

	@Override
	public String action() {
		return globalAction();
	}

	@Override
	public String dual() {
		return action();
	}

	/*************************************
	 * Create Type
	 *************************************/

	@Override
	public Pass create(Type type) {
		return new GlobalPass(from, to, load(), type, this, -1);
	}
}
