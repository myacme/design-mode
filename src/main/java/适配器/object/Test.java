package 适配器.object;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/31 15:13
 */

public class Test {

	public static void main(String[] args) {
		System.out.println("===对象适配器===");
		System.out.println("输出电压：" + new VoltageAdapter(new Voltage220()).output5());
	}
}