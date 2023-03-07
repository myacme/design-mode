package 工厂.method;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/25 15:04
 */

public class JiliCarFactory extends CarFactory{


	@Override
	public void produceCars() {
		System.out.println("制造了一辆" + new JiliCar().getName());
	}
}