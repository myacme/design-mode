package 观察者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/21 16:14
 */

public class CurrentCondition extends Data implements Observer {

	@Override
	public void update(Data data) {
		super.setHumidity(data.getHumidity());
		super.setTemperature(data.getTemperature());
	}

	@Override
	public String toString() {
		return "官方网站：" + super.toString();
	}
}