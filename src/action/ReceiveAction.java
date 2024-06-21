package action;

import compiler.ast.base.Type;
import compiler.ast.local.Receive;

public class ReceiveAction extends PassAction {
	public ReceiveAction(String from, String to, String load) {
		super(to, from, load);
	}

	final String symbol() {
		return "?";
	}

	public String toString() {
		return from + symbol() + load();
	}

	@Override
	public boolean dependency(Action a) {
		return false;
	}

	/*************************************
	 * Equality functions
	 *************************************/

	@Override
	public boolean equals(Object o) {
		return (o instanceof ReceiveAction) && equalField((Action) o);
	}

	@Override
	boolean dualOf(Action a) {
		return (a instanceof SendAction) && equalField(a);
	}

	/*************************************
	 * Action String
	 *************************************/

	@Override
	public String action() {
		return receiverAction();
	}

	@Override
	public String dual() {
		return senderAction();
	}

	/*************************************
	 * Create Type
	 *************************************/

	@Override
	public Receive create(Type type) {
		return new Receive(to, from, load(), type, this, -1);
	}
}
