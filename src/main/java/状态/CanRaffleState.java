package 状态;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/23 15:59
 */

public class CanRaffleState implements State {

	private Activity activity;

	public CanRaffleState(Activity activity) {
		this.activity = activity;
	}

	@Override
	public void deduceMoney() {
		System.out.println("已扣除积分");
	}

	@Override
	public boolean raffle() {
		System.out.println("可以抽奖");
		activity.setDispenseState();
		return true;
	}

	@Override
	public void dispensePrize() {
		System.out.println("没有抽奖没有奖品");
	}
}