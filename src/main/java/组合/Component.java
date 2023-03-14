package 组合;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/14 15:12
 */

public abstract class Component {

	private String name;

	public Component(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void add(Component component) {
	}

	public void print() {
		System.out.println(this.name);
	}
}