package 备忘录;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/22 14:56
 */

public class Test {

	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		Originator originator = new Originator();
		originator.setOriginator("张三", 20, "当溜子");
		caretaker.addMemento(originator.getMemento());
		originator.setOriginator("张三", 30, "讨口");
		caretaker.addMemento(originator.getMemento());
		originator.setOriginator("张三", 40, "当集团董事长");
		caretaker.addMemento(originator.getMemento());
		originator.recovery(caretaker.getMemento("张三", 20));
		System.out.println(originator.toString());
		originator.recovery(caretaker.getMemento("张三", 30));
		System.out.println(originator.toString());
		originator.recovery(caretaker.getMemento("张三", 40));
		System.out.println(originator.toString());

	}
}