package 策略;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/24 14:54
 */

public class Test {

	public static void main(String[] args) {
		PekingDuck pekingDuck = new PekingDuck();
		pekingDuck.fly();
		pekingDuck.quack();
		ToyDuck toyDuck = new ToyDuck();
		toyDuck.fly();
		toyDuck.quack();
	}
}