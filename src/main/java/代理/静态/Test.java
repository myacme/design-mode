package 代理.静态;


import 代理.TeacherDao;

/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/16 14:31
 */

public class Test {

	public static void main(String[] args) {
		//被代理对象
		TeacherDao teacherDao = new TeacherDao();
		//代理对象
		TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
		teacherDaoProxy.teach();
	}
}