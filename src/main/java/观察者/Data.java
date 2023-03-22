package 观察者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/21 16:11
 */

public class Data {

	private float temperature;

	private float humidity;

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	@Override
	public String toString() {
		return "温度= " + temperature + ", 湿度= " + humidity;
	}
}