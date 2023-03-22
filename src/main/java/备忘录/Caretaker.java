package 备忘录;


import java.util.HashMap;
import java.util.Map;

/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/22 14:42
 */

public class Caretaker {

	private Map<String, Object> map = new HashMap<>();

	public void addMemento(Memento memento) {
		Map<String, Memento> objectMap = (Map<String, Memento>) map.get(memento.getName());
		if (objectMap == null) {
			HashMap<String, Memento> mementos = new HashMap<>();
			mementos.put(String.valueOf(memento.getAge()), memento);
			map.put(memento.getName(), mementos);
		} else {
			objectMap.put(String.valueOf(memento.getAge()), memento);
		}
	}

	public Memento getMemento(String name, int age) {
		Map<String, Memento> objectMap = (Map<String, Memento>) map.get(name);
		if (objectMap != null) {
			return objectMap.get(String.valueOf(age));
		}
		return null;
	}
}