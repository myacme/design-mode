package 装饰者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/13 15:22
 */

public class Soy extends Decorator {


	public Soy(Drink drink) {
		super(drink);
		setName("豆浆 ");
		setPrice(2);
	}
}