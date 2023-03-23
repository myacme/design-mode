package 解释器;


import java.util.Map;

/**
 * 抽象运算符号解析器这里,每个运算符号，都只和自己左右两个数字有关系，
 * 但左右两个数字有可能也是一个解析的结果，无论何种类型，都是Expression类的实现类
 *
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/23 14:50
 */

public class SymbolExpression extends Expression {

	Expression left;
	Expression right;

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}


	@Override
	public int interpreter(Map<String, Integer> map) {
		return 0;
	}
}