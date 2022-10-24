package singleton;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/24 15:29
 */

public class StaticInterior {

	private StaticInterior() {
	}

	/**
	 * StaticInterior实例化是不会被示例化，
	 * 在调用getInstance（）时实例化，并且是线程安全的，只会执行一次
	 */
	private static class StaticInteriorInstance {
		private static final StaticInterior INSTANCE = new StaticInterior();
	}

	public StaticInterior getInstance() {
		return StaticInteriorInstance.INSTANCE;
	}
}