package 中介者;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/22 11:27
 */

public class Tv extends ElectricAppliance {


	public Tv(String name, Mediator mediator) {
		super(name, mediator);
	}

	@Override
	public void sendMessage() {
		super.getMediator().getMessage(this);
	}
}