package 代理.动态.JDK;


import 代理.ITeacherDao;
import 代理.TeacherDao;

import java.lang.reflect.Proxy;

/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/16 14:46
 */

public class ProxyFactory {

	private Object object;

	public ProxyFactory(Object object) {
		this.object = object;
	}

	public Object getProxyInstacne() {
		return  Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(),
				(proxy, method, args) -> {
					System.out.println("JDK代理开始");
					Object invoke = method.invoke(object, args);
					System.out.println("JDK代理结束");
					return invoke;
				});
	}
}