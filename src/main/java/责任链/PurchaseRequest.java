package 责任链;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/24 15:11
 */

public class PurchaseRequest {

	private String type;
	private float price;

	public PurchaseRequest(String type, float price) {
		this.type = type;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}