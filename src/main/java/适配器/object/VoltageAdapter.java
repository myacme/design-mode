package 适配器.object;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/31 15:07
 */

public class VoltageAdapter implements Voltage5 {

	private Voltage220 voltage220;

	public VoltageAdapter(Voltage220 voltage220) {
		this.voltage220 = voltage220;
	}

	@Override
	public int output5() {
		return voltage220.output() / 44;
	}
}