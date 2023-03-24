package 策略;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/24 14:49
 */

public class Duck {

	private Fly fly;
	private Quack quack;

	public Duck(Fly fly, Quack quack) {
		this.fly = fly;
		this.quack = quack;
	}

	public void fly() {
		fly.fly();
	}


	public void quack() {
		quack.quack();
	}
}