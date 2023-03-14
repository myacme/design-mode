package 组合;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/14 15:13
 */

public class Test {

	public static void main(String[] args) {
		Component university = new University("BBA大学");
		Component computer = new College("计算机学院");
		Component mathematics = new College("数学学院");
		computer.add(new Department("软件工程"));
		computer.add(new Department("数字媒体"));
		computer.add(new Department("网络工程"));
		mathematics.add(new Department("数学"));
		university.add(computer);
		university.add(mathematics);
		university.print();
	}
}