package 桥接;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/7 15:25
 */

public class LiuHaiping extends Phone {

	public LiuHaiping(Brand brand) {
		super(brand);
	}

	@Override
	public void call() {
		System.out.println("刘海屏手机");
		super.call();
	}
}