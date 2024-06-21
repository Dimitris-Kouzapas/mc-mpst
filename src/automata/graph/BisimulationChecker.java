package automata.graph;

import java.util.Set;
import java.util.HashSet;

import java.util.HashMap;

//import java.util.Queue;
import java.util.List;
import java.util.LinkedList;

import action.Action;

public class BisimulationChecker {
	private final Node graph1, graph2;

	public BisimulationChecker(Node graph1, Node graph2) {
		this.graph1 = graph1;
		this.graph2 = graph2;
	}

	public boolean bisimulation() {
		return simulation(graph1, graph2, new Closure()) && simulation(graph2, graph1, new Closure());
	}

	public boolean simulation() {
		return simulation(graph2, graph1, new Closure());
	}

	public static boolean simulation(Node graph1, Node graph2) {
		return simulation(graph1, graph2, new Closure());
	}

	private static boolean simulation(Node graph1, Node graph2, Closure closure) {
		if(closure.contains(graph1, graph2))
			return true;

		if(graph1.active(graph2) == false)
			return false;

		closure.add(graph1, graph2);

		for(Action action: graph1.actions())
			for(Node next1 : graph1.nextState(action)) {
				boolean simulationFlag = false;
				for(Node next2 : graph2.nextState(action)) {
					simulationFlag = simulationFlag || simulation(next1, next2, closure);
					if(simulationFlag == true)
						break;
				}

				if(simulationFlag == false) {
					closure.remove(graph1, graph2);
					return false;
				}
			}
		closure.remove(graph1, graph2);
		return true;
	}

	private static class Closure {
		//TODO add and do not remove pairs from fullClosure -> after a successfull termination check all pairs for active role equality
		private Set<ClosurePair> fullClosure;
		private Set<ClosurePair> closure;
		Closure() {
			closure = new HashSet<ClosurePair>();
		}

		void add(Node a, Node b) {
			closure.add(new ClosurePair(a, b));
		}

		boolean contains(Node a, Node b) {
			return closure.contains(new ClosurePair(a, b));
		}

		void remove(Node a, Node b) {
			closure.remove(new ClosurePair(a, b));
		}

		private class ClosurePair {
			final Node a, b;
			ClosurePair(Node a, Node b) {
				this.a = a;
				this.b = b;
			}

			public int hashCode() {
				return a.hashCode() ^ b.hashCode();
			}

			public boolean equals(Object o) {
				if((o instanceof ClosurePair) == false)
					return false;
				//return a.seq == ((ClosurePair) o).a.seq && b.seq == ((ClosurePair) o).b.seq; 
				return a.equals(((ClosurePair) o).a) && b.equals(((ClosurePair) o).b);
			}
			//public String toString() {
			//	return "("+ a + ", " + b + "), ";
			//}
		}
		//public String toString() {
		//	String s = "";
		//	for(ClosurePair cp: closure)
		//		s  += cp.toString();
		//	return s;
		//}
	}


/*	private static class Closure {
//		private Set<ClosurePair> closure;
		private MyHashSet<ClosurePair> closure;
//		private LinkedList<ClosurePair> pool;

		//int size() {
		//	return closure.size();
		//}

		private int head;
		private int elements;
		private int capacity;
		private ClosurePair[] pool;

		Closure() {
			closure = new MyHashSet<ClosurePair>();
			capacity = 0;
			head = 0;
		}

		private void fill() {
			capacity = capacity + 16;
			pool = new ClosurePair[capacity];
			for(head = 0; head < 16; head++)
				pool[head] = new ClosurePair();
		}

		private void fill(ClosurePair pair) {
			pool[head++] = pair;
		}

		private ClosurePair pair(Node a, Node b) {
			if(head == 0)
				fill();

			ClosurePair pair = pool[--head];

			pair.set(a, b);
			return pair;
		}

		void add(Node a, Node b) {
			closure.add(pair(a, b));
		}

		boolean contains(Node a, Node b) {
			ClosurePair p = pair(a, b);
			boolean flag = closure.contains(p);
			fill(p);
			return flag;
		}

		void remove(Node a, Node b) {
			ClosurePair p = pair(a, b);
			ClosurePair pp = closure.remove(p);
			fill(p);
			fill(pp);
		}

		private class ClosurePair {
			private Node a, b;
			ClosurePair() {
				this(null, null);
			}

			ClosurePair(Node a, Node b) {
				set(a, b);
			}

			void set(Node a, Node b) {
				this.a = a;
				this.b = b;
			}

			public int hashCode() {
				return a.hashCode() ^ b.hashCode();
			}

			public boolean equals(Object o) {
				if((o instanceof ClosurePair) == false)
					return false;
				return a.equals(((ClosurePair) o).a) && b.equals(((ClosurePair) o).b);
			}
			//public String toString() {
			//	return "("+ a + ", " + b + "), ";
			//}
		}

		private class MyHashSet<E> {
			private HashMap<E, E> map;

//			private final Object PRESENT = new Object();

			MyHashSet() {
				map = new HashMap<E, E>();
			}

			E remove(E e) {
				E old = map.get(e);
				map.remove(e);
				return old;
			}

			boolean add(E e) {
				return map.put(e, e) == null;
			}

			int size() {
				return map.size();
			}

			boolean contains(E e) {
				return map.containsKey(e);
			}

			//public boolean remove(Object o) {
			//	return map.remove(o)==PRESENT;
			//}

			//public void clear() {
			//	map.clear();
			//}

			//public boolean isEmpty() {
			//	return map.isEmpty();
			//}

			//public Iterator<E> iterator() {
			//	return map.keySet().iterator();
			//}

		}
	}
*/

/*
	private static class Closure {
		private final Set<Integer> closure;
		Closure() {
			closure = new HashSet<Integer>();
		}

		void add(Node a, Node b) {
			closure.add(a.hashCode() ^ b.hashCode());
		}

		boolean contains(Node a, Node b) {
			return closure.contains(a.hashCode() ^ b.hashCode());
		}

		void remove(Node a, Node b) {
			closure.remove(a.hashCode() ^ b.hashCode());
		}
	}
*/
}
