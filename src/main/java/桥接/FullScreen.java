package 桥接;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/7 15:23
 */

public class FullScreen extends Phone {

	public FullScreen(Brand brand) {
		super(brand);
	}

	@Override
	public void call() {
		System.out.println("全面屏手机");
		super.call();
	}
}