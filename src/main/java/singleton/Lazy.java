package singleton;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/24 15:11
 */

public class Lazy {


}


/**
 * 单例模式--懒汉式
 */
class Lazy001 {

	private Lazy001() {
	}

	private static Lazy001 instance;

	public Lazy001 getInstance() {
		if (instance == null) {
			instance = new Lazy001();
		}
		return instance;
	}
}

/**
 * 单例模式--懒汉式--线程安全
 */
class Lazy002 {

	private Lazy002() {
	}

	private static Lazy002 instance;

	public synchronized Lazy002 getInstance() {
		if (instance == null) {
			instance = new Lazy002();
		}
		return instance;
	}
}

/**
 * 单例模式--懒汉式--双重检查
 */
class Lazy003 {

	private Lazy003() {
	}

	private static volatile Lazy003 instance;

	public Lazy003 getInstance() {
		if (instance == null) {
			synchronized (Lazy.class) {
				if (instance == null) {
					instance = new Lazy003();
				}
			}
		}
		return instance;
	}
}