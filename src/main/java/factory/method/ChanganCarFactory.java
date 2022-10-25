package factory.method;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/25 15:04
 */

public class ChanganCarFactory  extends CarFactory{

	@Override
	public void produceCars() {
		System.out.println("制造了一辆" + new ChanganCar().getName());
	}
}