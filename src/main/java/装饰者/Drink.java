package 装饰者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/13 15:14
 */

public abstract class Drink {

	private String name;
	private float price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public abstract float cost();
}