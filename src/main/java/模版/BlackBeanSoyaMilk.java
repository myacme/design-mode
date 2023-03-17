package 模版;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/17 14:59
 */

public class BlackBeanSoyaMilk extends SoyaMilk {

	@Override
	public void add() {
		System.out.println("加入黑豆");
	}
	@Override
	public void hanger() {
		System.out.println("钩子方法");
	}
}