package 享元;


import java.util.HashMap;
import java.util.Map;

/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/15 14:52
 */

public class WebSiteFactor {

	private Map<String, WebSite> pool = new HashMap<>();

	public WebSite getWebSiteCategory(String type) {
		if (!pool.containsKey(type)) {
			pool.put(type, new ConcreteWebSite(type));
		}
		return pool.get(type);
	}

	public int getPoolSize() {
		return pool.size();
	}
}