package 状态;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/23 16:03
 */

public class Activity {

	private final NoRaffleState noRaffleState = new NoRaffleState(this);
	private final CanRaffleState canRaffleState = new CanRaffleState(this);
	private final DispenseState dispenseState = new DispenseState(this);
	private final DispenseOutState dispenseOutState = new DispenseOutState(this);
	private State state;

	public Activity() {
		this.state = noRaffleState;
	}

	public void setNoRaffleState() {
		this.state = noRaffleState;
	}

	public void setCanRaffleState() {
		this.state = canRaffleState;
	}

	public void setDispenseState() {
		this.state = dispenseState;
	}

	public void setDispenseOutState() {
		this.state = dispenseOutState;
	}

	public void deduceMoney() {
		state.deduceMoney();
	}

	public void raffle() {
		state.raffle();
	}

	public void dispensePrize() {
		state.dispensePrize();
	}
}