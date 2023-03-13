package 装饰者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/13 15:22
 */

public class Milk extends Decorator {


	public Milk(Drink drink) {
		super(drink);
		setName("牛奶 ");
		setPrice(3);
	}
}