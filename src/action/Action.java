package action;

import compiler.ast.base.Type;
import compiler.ast.base.Pass;

public abstract class Action {
	public final String from, to;
	private final String load;
	private boolean label;

	Action(String from, String to, String load) {
		this.from = from;
		this.to = to;
		label = load.charAt(0) == labelSymbol;
		this.load = (label == false) ? load : load.substring(1);
	}

	/*************************************
	 * Load Type
	 *************************************/

	private final String label() {
		return (label == true) ? "l" : "v";
	}

	final String load() {
		return ((label == true) ? "@" : "") + load;
	}

	private static final char labelSymbol = '@';

	public final Action compose(Action action) {
		if(from.equals(action.from) && to.equals(action.to)) {
			if(load().equals(action.load()))
				return this;
			else if(label == false && action.label == false)
				return new ErrorAction(from, to);
		}
		return null;
	}

	public final PassAction global() {
		return new PassAction(from, to, load());
	}

	public final PassAction error() {
		return new ErrorAction(from, to);
	}

	/*************************************
	 * Hash and equality functions
	 *************************************/

	final boolean equalField(Action a) {
		return from.equals(a.from) && to.equals(a.to) && load.equals(a.load) && label == a.label;
	}

	@Override
	public final int hashCode() {
		return (from + "_" + to + "_" + label() + "_" + load()).hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Action) {
			Action a = (Action) o;
			return equalField(a);
		}
		return false;
	}

	public final boolean hasRole(Action a) {
		return (from.equals(a.from) || to.equals(a.from) || from.equals(a.to) || to.equals(a.to));
	}

	abstract boolean dualOf(Action a);
	abstract boolean isOf(Action a);

	public abstract boolean dependency(Action a);

	/*************************************
	 * Action String
	 *************************************/

	String printAction(String op) {
		return from + "_" + op + "_" + to + "_" + label() + "_" + load;		
	}

	abstract String symbol();

	public abstract String senderAction();
	public abstract String receiverAction();
	public abstract String globalAction();

	public final String commAction() {
		return senderAction() + "|" + receiverAction() + "->" + globalAction();
	}

	public abstract String action();
	public abstract String dual();

	/*************************************
	 * Create Type
	 *************************************/

	public abstract Pass create(Type type);
}

