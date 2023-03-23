package 状态;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/23 15:59
 */

public class DispenseState implements State {

	private Activity activity;

	public DispenseState(Activity activity) {
		this.activity = activity;
	}

	@Override
	public void deduceMoney() {
		System.out.println("已扣除积分");
	}

	@Override
	public boolean raffle() {
		System.out.println("已中奖");
		return false;
	}

	@Override
	public void dispensePrize() {
		System.out.println("已中奖，领取奖品");
		activity.setDispenseOutState();
	}
}