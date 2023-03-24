package 策略;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/24 14:52
 */

public class PekingDuck extends Duck {

	public PekingDuck() {
		super(new GoodFly(), new GeGeQuack());
	}
}