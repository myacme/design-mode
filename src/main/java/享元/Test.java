package 享元;


/**
 * 池技术
 *
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/15 14:57
 */

public class Test {

	public static void main(String[] args) {
		WebSiteFactor pool = new WebSiteFactor();
		pool.getWebSiteCategory("浏览器").use(new User("百度"));
		pool.getWebSiteCategory("微信").use(new User("新浪"));
		pool.getWebSiteCategory("微信").use(new User("腾讯"));
		pool.getWebSiteCategory("微信").use(new User("微博"));
		System.out.println(pool.getPoolSize());
	}
}