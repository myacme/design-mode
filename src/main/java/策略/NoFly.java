package 策略;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/24 14:46
 */

public class NoFly implements Fly {


	@Override
	public void fly() {
		System.out.println("不会飞");
	}
}