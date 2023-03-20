package 访问者;


import java.util.ArrayList;
import java.util.List;

/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/20 16:08
 */

public class ObjectStructure {

	private final List<Person> list = new ArrayList<>();

	public void add(Person person) {
		list.add(person);
	}

	public void display(Action action) {
		for (Person person : list) {
			person.accept(action);
		}
	}
}