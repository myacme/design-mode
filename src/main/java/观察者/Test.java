package 观察者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/21 16:22
 */

public class Test {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData(30, 25);
		CurrentCondition currentCondition = new CurrentCondition();
		Baidu baidu = new Baidu();
		weatherData.registerObserver(currentCondition);
		weatherData.registerObserver(baidu);
		System.out.println(currentCondition.toString());
		System.out.println(baidu.toString());
		weatherData.update(40, 30);
		System.out.println(currentCondition.toString());
		System.out.println(baidu.toString());
	}
}