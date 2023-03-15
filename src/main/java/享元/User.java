package 享元;


/**
 * 外部状态
 *
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/15 15:06
 */

public class User {

	private String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}