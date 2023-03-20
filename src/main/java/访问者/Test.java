package 访问者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/20 16:14
 */

public class Test {

	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.add(new Woman());
		objectStructure.add(new Man());
		Success success = new Success();
		objectStructure.display(success);
		System.out.println();
	}
}