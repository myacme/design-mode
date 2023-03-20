package 访问者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/20 16:01
 */

public class Woman extends Person {

	public Woman() {
		super("女人");
	}

	@Override
	public void accept(Action action) {
		action.evaluate(this);
	}
}