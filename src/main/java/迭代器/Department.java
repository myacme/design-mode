package 迭代器;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * 专业
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/14 15:14
 */

public class Department extends College {

	List<College> list = new ArrayList<>();

	public Department(String name) {
		super(name);
	}

	@Override
	public void add(College college) {
		this.list.add(college);
	}

	@Override
	public void print() {
		System.out.print("  ");
		super.print();
	}
}