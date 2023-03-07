package 建造者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/28 14:45
 */

public class Car {

	private String tyre;

	private String frame;

	private String engine;

	public String getTyre() {
		return tyre;
	}

	public void setTyre(String tyre) {
		this.tyre = tyre;
	}

	public String getFrame() {
		return frame;
	}

	public void setFrame(String frame) {
		this.frame = frame;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car{" +
				"tyre='" + tyre + '\'' +
				", frame='" + frame + '\'' +
				", engine='" + engine + '\'' +
				'}';
	}
}