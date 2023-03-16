package 代理.动态.Cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/16 14:46
 */

public class ProxyFactory implements MethodInterceptor {

	public Object getProxyInstacne(Class clazz) {
		//1。创建一个工具类
		Enhancer enhancer = new Enhancer();
		//2。设置父类
		enhancer.setSuperclass(clazz);
		//3。设置回调函数
		enhancer.setCallback(new ProxyFactory());
		//4。创建子类对象，即代理对象
		return enhancer.create();
	}

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("Cglib代理开始");
		Object invoke = methodProxy.invokeSuper(o, objects);
		System.out.println("Cglib代理结束");
		return invoke;
	}
}