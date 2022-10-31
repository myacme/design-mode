package adapter.object;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/31 15:05
 */

public class Voltage220 {

	private int v = 220;

	public int output() {
		System.out.println("输出220V");
		return v;
	}
}