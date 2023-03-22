package 中介者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/22 11:17
 */

public abstract class ElectricAppliance {

	private String name;

	private Mediator mediator;

	public ElectricAppliance(String name, Mediator mediator) {
		this.name = name;
		this.mediator = mediator;
		mediator.registerElectricAppliance(this);
	}

	public abstract void sendMessage();


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
}