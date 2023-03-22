package 观察者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/21 16:08
 */

public interface Subject {

	void registerObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObserver();
}