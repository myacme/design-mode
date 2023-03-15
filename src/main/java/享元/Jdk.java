package 享元;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/15 15:12
 */

public class Jdk {

	public static void main(String[] args) {
		Integer a = Integer.valueOf(127);
		Integer b = Integer.valueOf(127);
		System.out.println(a == b);
	}
}