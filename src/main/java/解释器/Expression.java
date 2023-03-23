package 解释器;


import java.util.Map;

/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/23 14:50
 */

public abstract class Expression {


	public abstract int interpreter(Map<String, Integer> map);
}