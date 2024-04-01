package 解释器;


import java.util.Map;
import java.util.Stack;

/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/23 15:02
 */

public class Calculator {

	private Expression expression;

	public Calculator(String exp) {
		Stack<Expression> stack = new Stack<>();
		char[] array = exp.toCharArray();
		Expression left = null;
		Expression right = null;
		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
				case '+':
					left = stack.pop();
					right = new VarExpression(String.valueOf(array[++i]));
					stack.push(new AddExpression(left, right));
					break;
				case '-':
					left = stack.pop();
					right = new VarExpression(String.valueOf(array[++i]));
					stack.push(new SubExpression(left, right));
					break;
				case '*':
					left = stack.pop();
					right = new VarExpression(String.valueOf(array[++i]));
					stack.push(new MultiplyExpression(left, right));
					break;
				default:
					stack.push(new VarExpression(String.valueOf(array[i])));
					break;
			}
		}
		this.expression = stack.pop();
	}

	public int run(Map<String, Integer> map) {
		return this.expression.interpreter(map);
	}
}