package builder;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/28 14:56
 */

public class Director {

	private final Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public Car create() {
		builder.createTyre();
		builder.createFrame();
		builder.createEngine();
		return builder.builder();
	}
}