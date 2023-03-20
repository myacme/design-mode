package 访问者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/20 15:59
 */

public abstract class Person {

	String type;

	public Person(String type) {
		this.type = type;
	}

	public abstract void accept(Action action);

	public String getType() {
		return type;
	}
}