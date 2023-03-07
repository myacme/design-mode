package 桥接;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/7 15:20
 */

public class Honor implements Brand {


	@Override
	public void call() {
		System.out.println("华为手机通话系统");
	}
}