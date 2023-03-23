package 解释器;


import java.util.HashMap;
import java.util.Map;

/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/23 15:20
 */

public class Test {

	public static void main(String[] args) {
		String exp = "a-b";
		Map<String, Integer> hashMap = new HashMap<String, Integer>(4) {{
			put("a", 10);
			put("b", 20);
		}};
		Calculator calculator = new Calculator(exp);
		System.out.println(calculator.run(hashMap));
	}
}