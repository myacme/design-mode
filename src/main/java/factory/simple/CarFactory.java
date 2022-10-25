package factory.simple;


/**
 * 汽车工厂
 *
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/25 14:21
 */

public class CarFactory {

	public void produceCars(String carName) {
		switch (carName) {
			case "长安汽车":
				System.out.println("制造了一辆" + new ChanganCar().getName());
				break;
			case "吉利汽车":
				System.out.println("制造了一辆" + new JiliCar().getName());
				break;
			default:
				break;
		}
	}
}