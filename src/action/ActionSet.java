package action;

import java.util.Set;
import java.util.HashSet;

public final class ActionSet {
	private final Set<Action> single;
	private final Set<Action> dual;
	
	public ActionSet() {
		single = new HashSet<Action>();
		dual = new HashSet<Action>();
	}

	public final Set<Action> single() {
		return single;
	}

	public final Set<Action> dual() {
		return dual;
	}

	private final boolean existsInDual(Action a) {
		for(Action aa: dual)
			if(aa.isOf(a))
				return true;
		return false;
	}

	private final Action dualInSingle(Action a) {
		for(Action aa: single)
			if(aa.dualOf(a))
				return aa;
		return null;
	}

	public final void add(Action a) {
		if(!existsInDual(a)) {
			Action d = dualInSingle(a);
			if(d == null) {
				single.add(a);
			}
			else {
				single.remove(d);
				dual.add(a);
			}
		}
	}

	public final void addAll(Set<Action> s) {
		for(Action a: s)
			add(a);
	}
}
