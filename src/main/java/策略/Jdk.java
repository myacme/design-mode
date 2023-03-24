package 策略;


import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/24 14:57
 */

public class Jdk {

	public static void main(String[] args) {
		Integer[] array = {1, 4, 7, 3, 9};
		//不同的策略
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 > o2 ? -1 : 1;
			}
		};
		//策略模式
		Arrays.sort(array, comparator);
		System.out.println(Arrays.toString(array));
	}
}