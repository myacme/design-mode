package 装饰者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/13 15:14
 */

public class Coffee extends Drink {

	@Override
	public float cost() {
		return getPrice();
	}
}