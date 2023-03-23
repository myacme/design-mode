package 状态;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/23 15:57
 */

public interface State {

	void deduceMoney();

	boolean raffle();

	void dispensePrize();
}