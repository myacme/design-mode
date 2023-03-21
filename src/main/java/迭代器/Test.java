package 迭代器;


import java.util.Iterator;

/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/21 15:27
 */

public class Test {

	public static void main(String[] args) {
		ComputerCollege computerCollege = new ComputerCollege("计算机学院");
		InfoCollege infoCollege = new InfoCollege("信息学院");
		System.out.println(computerCollege.getName());
		Iterator computerCollegeIterator = computerCollege.getIterator();
		while (computerCollegeIterator.hasNext()) {
			System.out.println(((Department) computerCollegeIterator.next()).getName());
		}
		System.out.println(infoCollege.getName());
		Iterator infoCollegeIterator = infoCollege.getIterator();
		while (infoCollegeIterator.hasNext()) {
			System.out.println(((Department) infoCollegeIterator.next()).getName());
		}
	}
}