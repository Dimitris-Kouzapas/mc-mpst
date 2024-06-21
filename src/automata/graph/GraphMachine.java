package automata.graph;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

import action.Action;
import runtime.Stream;

//TODO rename this class
public class GraphMachine {
	private final List<RecursionNode> rList;
	private final Node init;
	private final Set<Action> actionSet;

	public GraphMachine(Node init) {
		this.init = init;
		rList = new ArrayList<RecursionNode>();
		actionSet = new HashSet<Action>();
		init.set(this);
	}

	/*****************************
	* Graph Construction
	******************************/

	int add(RecursionNode r) {
		rList.add(r);
		return rList.size() - 1;
	}

	void add(Action action) {
		actionSet.add(action);
	}

	/*****************************
	* Print mCRL2
	******************************/

	private void actions(Stream stream) {
		stream.print("act");

		boolean first = true;
		for(Action a: actionSet) {
			if(first != true)
				stream.println(",");
			stream.print("\t" + a.action());
			first = false;
		}
		stream.println(";\n");
	}

	static final String recSymbol = "R";
	static final String procSymbol = "P";

	public void mCRL2(Stream stream) {
		//TODO if action is empty then print nothing
		actions(stream);

		stream.print("proc " + procSymbol + " = ");
		init.mCRL2(stream);
		stream.println(";");
		stream.println();

		for(RecursionNode r: rList) {
			stream.print("proc ");
			r.mCRL2(stream);
			stream.print(" = ");
			r.mCRL2Body(stream);
			stream.println(";\n");
		}

		//stream.println("proc context =");
		//stream.pushIndent();
		//stream.print(procSymbol);
		//stream.println(";");
		//stream.popIndent();
		//stream.println();

		stream.println("init " + procSymbol + ";");
	}
}
