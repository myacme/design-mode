package 解释器;


import java.util.Map;

/**
 * 变量解释器
 *
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/23 14:50
 */

public class VarExpression extends Expression {

	private String key;

	public VarExpression(String key) {
		this.key = key;
	}

	@Override
	public int interpreter(Map<String, Integer> map) {
		return map.get(key);
	}
}