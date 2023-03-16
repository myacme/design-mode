package 代理.静态;


import 代理.ITeacherDao;
import 代理.TeacherDao;

/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/16 14:29
 */

public class TeacherDaoProxy implements ITeacherDao {

	private TeacherDao teacherDao;

	public TeacherDaoProxy(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	@Override
	public void teach() {
		System.out.println("开始代理");
		teacherDao.teach();
		System.out.println("结束代理");
	}
}