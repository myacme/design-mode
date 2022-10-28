package builder;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/28 15:01
 */

public class Test {

	public static void main(String[] args) {
		//方式一
		Director director = new Director(new SedanBuilder());
		Car sedanCar = director.create();
		System.out.println(sedanCar);
		//方式二
		Car truckCar = new TruckBuilder().createTyre().createFrame().createEngine().builder();
		System.out.println(truckCar);
	}
}