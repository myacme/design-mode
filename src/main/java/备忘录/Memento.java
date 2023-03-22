package 备忘录;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/22 14:42
 */

public class Memento {
	private String name;
	private int age;
	private String work;

	public Memento(String name, int age, String work) {
		this.name = name;
		this.age = age;
		this.work = work;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getWork() {
		return work;
	}
}