package 模版;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/17 14:56
 */

public abstract class SoyaMilk {

	public final void make() {
		select();
		add();
		soak();
		beat();
		hanger();
		System.out.println("制作完成");
	}

	public void select() {
		System.out.println("1、选择原料");
	}

	public void hanger() {
	}

	public abstract void add();

	public void soak() {
		System.out.println("2、浸泡");
	}

	public void beat() {
		System.out.println("3、研磨");
	}
}