package 装饰者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/13 15:16
 */

public class Decorator extends Drink {

	private final Drink drink;

	public Decorator(Drink drink) {
		this.drink = drink;
	}

	@Override
	public float cost() {
		return getPrice() + drink.cost();
	}

	@Override
	public String getName() {
		return super.getName() + drink.getName();
	}
}