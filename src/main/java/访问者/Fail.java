package 访问者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/20 16:05
 */

public class Fail extends Action {

	@Override
	public void evaluate(Person person) {
		System.out.println(person.getType() + "评价为：失败");
	}
}