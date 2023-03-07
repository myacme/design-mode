package 工厂.abstract1;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/25 15:04
 */

public class ChanganFactory extends Factory {

	@Override
	public void produceCars() {
		System.out.println("制造了一辆" + new ChanganCar().getName());
	}

	@Override
	public void produceEngine() {
		System.out.println("制造了一台" + new ChanganEngine().getName());
	}
}