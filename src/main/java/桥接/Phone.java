package 桥接;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/7 15:21
 */

public abstract class Phone {

	Brand brand;

	public Phone(Brand brand) {
		this.brand = brand;
	}

	public void call() {
		brand.call();
	}
}