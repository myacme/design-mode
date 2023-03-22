package 观察者;


import java.util.ArrayList;
import java.util.List;

/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/21 16:18
 */

public class WeatherData extends Data implements Subject {

	List<Observer> list = new ArrayList<>();

	public WeatherData(float temperature, float humidity) {
		super();
		super.setHumidity(humidity);
		super.setTemperature(temperature);
	}

	public void update(float temperature, float humidity) {
		super.setHumidity(humidity);
		super.setTemperature(temperature);
		notifyObserver();
	}

	@Override
	public void registerObserver(Observer observer) {
		list.add(observer);
		notifyObserver();
	}

	@Override
	public void removeObserver(Observer observer) {
		list.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : list) {
			observer.update(this);
		}
	}
}