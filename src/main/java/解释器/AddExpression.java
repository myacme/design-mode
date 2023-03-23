package 解释器;


import java.util.Map;

/**
 * 加法解释器
 *
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/23 14:50
 */

public class AddExpression extends SymbolExpression {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}


	@Override
	public int interpreter(Map<String, Integer> map) {
		return super.left.interpreter(map) + super.right.interpreter(map);
	}
}