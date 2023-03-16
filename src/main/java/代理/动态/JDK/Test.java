package 代理.动态.JDK;


import 代理.ITeacherDao;
import 代理.TeacherDao;

/**
 * 代理有接口的类
 *
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/16 14:51
 */

public class Test {

	public static void main(String[] args) {
		//被代理对象
		TeacherDao teacherDao = new TeacherDao();
		//代理对象
		ITeacherDao proxyInstacne = (ITeacherDao) new ProxyFactory(teacherDao).getProxyInstacne();
		proxyInstacne.teach();
	}
}