package 单例;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/24 15:04
 */

public class Hunger {
}

/**
 * 单列模式--饿汉式--静态常量
 */
class Hunger001 {

	private Hunger001() {
	}

	private static final Hunger001 INSTANCE = new Hunger001();

	public Hunger001 getInstance() {
		return INSTANCE;
	}
}

/**
 * 单列模式--饿汉式--静态代码块
 */
class Hunger002 {

	private Hunger002() {
	}

	private static final Hunger002 INSTANCE;

	static {
		INSTANCE = new Hunger002();
	}

	public Hunger002 getInstance() {
		return INSTANCE;
	}
}