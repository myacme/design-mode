package 装饰者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/13 15:25
 */

public class Test {

	public static void main(String[] args) {
		Drink coffee = new LongBlack();
		coffee = new Milk(coffee);
		System.out.println(coffee.getName());
		System.out.println(coffee.cost());

		coffee = new Soy(coffee);
		System.out.println(coffee.getName());
		System.out.println(coffee.cost());
	}
}