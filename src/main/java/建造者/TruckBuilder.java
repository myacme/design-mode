package 建造者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/28 14:48
 */

public class TruckBuilder implements Builder {

	private final Car car = new Car();


	@Override
	public Builder createTyre() {
		car.setTyre("卡车轮胎");
		return this;
	}

	@Override
	public Builder createFrame() {
		car.setFrame("卡车车架");
		return this;
	}

	@Override
	public Builder createEngine() {
		car.setEngine("柴油发动机");
		return this;
	}

	@Override
	public Car builder() {
		return this.car;
	}
}