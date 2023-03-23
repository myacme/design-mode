package 状态;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/23 16:14
 */

public class Test {

	public static void main(String[] args) {
		Activity activity = new Activity();
		activity.deduceMoney();
		activity.deduceMoney();
		activity.raffle();
		activity.dispensePrize();
		activity.dispensePrize();
	}
}