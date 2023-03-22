package 中介者;


import java.util.HashMap;
import java.util.Map;

/**
 * 解耦 在中介者中调用其他类
 *
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/22 11:20
 */

public class ConcreteMediator implements Mediator {

	Map<String, ElectricAppliance> map = new HashMap<>();


	@Override
	public void registerElectricAppliance(ElectricAppliance electricAppliance) {
		if (electricAppliance instanceof Alarm) {
			map.put("Alarm", electricAppliance);
		}
		if (electricAppliance instanceof Tv) {
			map.put("Tv", electricAppliance);
		}
	}

	@Override
	public void getMessage(ElectricAppliance electricAppliance) {
		if (electricAppliance instanceof Alarm) {
			System.out.print("闹钟响了 ");
			map.get("Tv").sendMessage();
		}
		if (electricAppliance instanceof Tv) {
			System.out.println("打开" + map.get("Tv").getName());
		}
	}
}