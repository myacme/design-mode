package 策略;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/24 14:47
 */

public class NoQuack implements Quack {


	@Override
	public void quack() {
		System.out.println("不会叫");
	}
}