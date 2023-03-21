package 迭代器;


import java.util.Iterator;

/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/21 15:21
 */

public class InfoCollege extends College {

	Department[] list = new Department[5];

	public InfoCollege(String name) {
		super(name);
		list[0] = new Department("工程信息");
		list[1] = new Department("安全信息");
		list[2] = new Department("项目信息");
	}


	public Iterator getIterator() {
		return new InfoCollegeIterator(list);
	}
}