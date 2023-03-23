package 状态;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/23 15:59
 */

public class DispenseOutState implements State {

	private Activity activity;

	public DispenseOutState(Activity activity) {
		this.activity = activity;
	}

	@Override
	public void deduceMoney() {
		System.out.println("活动结束");
	}

	@Override
	public boolean raffle() {
		System.out.println("活动结束");
		return false;
	}

	@Override
	public void dispensePrize() {
		System.out.println("活动结束");
	}
}