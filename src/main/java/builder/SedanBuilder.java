package builder;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/28 14:48
 */

public class SedanBuilder implements Builder {

	private final Car car = new Car();


	@Override
	public Builder createTyre() {
		car.setTyre("小车轮胎");
		return this;
	}

	@Override
	public Builder createFrame() {
		car.setFrame("小车车架");
		return this;
	}

	@Override
	public Builder createEngine() {
		car.setEngine("汽油发动机");
		return this;
	}

	@Override
	public Car builder() {
		return this.car;
	}
}