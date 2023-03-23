package 状态;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/23 15:59
 */

public class NoRaffleState implements State {

	private Activity activity;

	public NoRaffleState(Activity activity) {
		this.activity = activity;
	}

	@Override
	public void deduceMoney() {
		System.out.println("扣除积分");
		activity.setCanRaffleState();
	}

	@Override
	public boolean raffle() {
		System.out.println("还不能抽奖");
		return false;
	}

	@Override
	public void dispensePrize() {
		System.out.println("没有抽奖没有奖品");
	}
}