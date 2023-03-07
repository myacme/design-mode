package 工厂.simple;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/25 14:46
 */

public class Test {

	/**
	 * 一个抽象产品类，
	 * 1)优点是比较好理解，简单易操作。
	 * 2)缺点是违反了设计模式的ocp原则，即对扩展开放，对修改关闭。即当我们给类增
	 * 加新功能的时候,尽量不修改代码,或者尽可能少修改代码.
	 */

	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		carFactory.produceCars("长安汽车");
	}
}