package 代理;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/16 14:28
 */

public class TeacherDao implements ITeacherDao {


	@Override
	public void teach() {
		System.out.println("开始上课");
	}
}