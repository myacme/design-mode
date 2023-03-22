package 备忘录;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/22 14:39
 */

public class Originator {

	private String name;
	private int age;
	private String work;

	public void setOriginator(String name, int age, String work) {
		this.name = name;
		this.age = age;
		this.work = work;
	}

	public Memento getMemento() {
		return new Memento(name, age, work);
	}

	public void recovery(Memento memento) {
		if (memento != null) {
			this.name = memento.getName();
			this.age = memento.getAge();
			this.work = memento.getWork();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return name + "，" + age + "岁时在：" + work;
	}
}