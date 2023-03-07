package 适配器.clazz;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/31 15:07
 */

public class VoltageAdapter extends Voltage220 implements Voltage5 {

	@Override
	public int output5() {
		return super.output() / 44;
	}
}