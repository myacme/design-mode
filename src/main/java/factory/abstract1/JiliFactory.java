package factory.abstract1;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/25 15:04
 */

public class JiliFactory extends Factory {


	@Override
	public void produceCars() {
		System.out.println("制造了一辆" + new JiliCar().getName());
	}

	@Override
	public void produceEngine() {
		System.out.println("制造了一台" + new JiliEngine().getName());
	}
}