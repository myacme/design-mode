package 中介者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/22 11:16
 */

public interface Mediator {

	void registerElectricAppliance(ElectricAppliance electricAppliance);

	void getMessage(ElectricAppliance electricAppliance);
}