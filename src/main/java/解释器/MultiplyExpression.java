package 解释器;


import java.util.Map;

/**
 * @author ljx
 * @version 1.0.0
 * @create 2024/3/11 15:25
 */
public class MultiplyExpression extends SymbolExpression{


	public MultiplyExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public int interpreter(Map<String, Integer> map) {
		return super.left.interpreter(map) * super.right.interpreter(map);
	}
}
