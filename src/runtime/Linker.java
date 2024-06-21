package runtime;

import java.util.Iterator;
import java.util.Map;
import java.util.LinkedHashMap;

import compiler.ProtocolModule;

class Linker implements Iterable<ProtocolModule> {
	private final Map<String, ProtocolModule> memory;

	Linker() {
		memory = new LinkedHashMap<String, ProtocolModule>();
	}

	ProtocolModule get(String id) {
		return memory.get(id);
	}

	boolean remove(String id) {
		return (memory.remove(id) != null);
	}

	void put(String id, ProtocolModule pd) {
		memory.put(id, pd);
	}

	Iterable<ProtocolModule> get() {
		return this;
	}

	public Iterator<ProtocolModule> iterator() {
		return memory.values().iterator();
	}

	boolean has(String id) {
		return memory.get(id) == null;
	}
}
