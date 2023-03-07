package 建造者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/28 15:04
 */

public class Jdk {

	public static void main(String[] args) {
		/**
		 * Appendable接口定义了多个append方法(抽象方法)，即Appendable为抽象建造者,定义了抽象方法
		 * AbstractStringBuilder实现了Appendable接口方法，这里的AbstractStringBuilder已经是建造者，只是不能实例化
		 * StringBuilder即充当了指挥者角色，同时充当了具体的建造者，建造方法的实现是由 AbstractStringBuilder完成,而StringBuilder继承了
		 * AbstractstringBuilder
		 */
		StringBuilder stringBuilder = new StringBuilder();
	}
}