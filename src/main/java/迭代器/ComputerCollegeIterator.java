package 迭代器;


import java.util.Iterator;
import java.util.List;

/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/21 15:16
 */

public class ComputerCollegeIterator implements Iterator {

	List<Department> list;
	Iterator<Department> iterator;

	public ComputerCollegeIterator(List<Department> list) {
		this.list = list;
		iterator = list.iterator();
	}

	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public Department next() {
		return iterator.next();
	}
}