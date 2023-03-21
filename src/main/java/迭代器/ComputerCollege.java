package 迭代器;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 院系
 *
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/14 15:14
 */

public class ComputerCollege extends College {

	List<Department> list = new ArrayList<>();

	public ComputerCollege(String name) {
		super(name);
		list.add(new Department("软件工程"));
		list.add(new Department("数字媒体"));
		list.add(new Department("网络工程"));
	}


	public Iterator getIterator() {
		return new ComputerCollegeIterator(list);
	}
}