package factory.method;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/25 14:46
 */

public class Test {

	/**
	 * 一个抽象产品类，一个抽象工厂类
	 */

	public static void main(String[] args) {
		CarFactory changanCarFactory = new ChanganCarFactory();
		changanCarFactory.produceCars();
	}
}