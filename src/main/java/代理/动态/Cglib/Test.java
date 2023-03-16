package 代理.动态.Cglib;


/**
 * 代理没有接口的类
 *
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/16 15:09
 */

public class Test {

	public static void main(String[] args) {
		//代理对象
		TeacherDao proxyInstacne = (TeacherDao) new ProxyFactory().getProxyInstacne(TeacherDao.class);
		proxyInstacne.teach();
	}
}