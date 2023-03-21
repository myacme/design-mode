package 迭代器;


import java.util.Iterator;

/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/21 15:16
 */

public class InfoCollegeIterator implements Iterator {

	Department[] list;
	int index = 0;

	public InfoCollegeIterator(Department[] list) {
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		return index < list.length && list[index] != null;
	}

	@Override
	public Department next() {
		Department department = list[index];
		index += 1;
		return department;
	}
}