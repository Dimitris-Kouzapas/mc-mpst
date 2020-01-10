package action;

import compiler.ast.base.Type;
import compiler.ast.local.Send;

public class SendAction extends PassAction {
	public SendAction(String from, String to, String load) {
		super(from, to, load);
	}

	final String symbol() {
		return "!";
	}

	public String toString() {
		return to + symbol() + load();
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
		return (o instanceof SendAction) && equalField((Action) o);
	}

	@Override
	boolean dualOf(Action a) {
		return (a instanceof ReceiveAction) && equalField(a);
	}

	/*************************************
	 * Action String
	 *************************************/

	@Override
	public String action() {
		return senderAction();
	}

	@Override
	public String dual() {
		return receiverAction();
	}

	/*************************************
	 * Create Type
	 *************************************/

	@Override
	public Send create(Type type) {
		return new Send(from, to, load(), type, this, -1);
	}
}
