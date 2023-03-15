package 享元;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/15 14:50
 */

public class ConcreteWebSite extends WebSite {

	/**
	 * 内部状态
	 */
	private String type;

	public ConcreteWebSite(String type) {
		this.type = type;
	}

	@Override
	public void use(User user) {
		System.out.println(user.getName() + " 网站发布终端类型为: " + type);
	}
}