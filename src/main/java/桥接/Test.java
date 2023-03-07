package 桥接;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/7 15:18
 */

public class Test {

	public static void main(String[] args) {
		FullScreen fullScreen = new FullScreen(new Hawei());
		fullScreen.call();
		LiuHaiping liuHaiping = new LiuHaiping(new Honor());
		liuHaiping.call();
	}


}