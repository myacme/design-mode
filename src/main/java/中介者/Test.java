package 中介者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/22 14:04
 */

public class Test {

	public static void main(String[] args) {
		ConcreteMediator concreteMediator = new ConcreteMediator();
		Alarm alarm = new Alarm("Alarm", concreteMediator);
		Tv tv = new Tv("Tv", concreteMediator);
		alarm.sendMessage();
		tv.sendMessage();
	}
}