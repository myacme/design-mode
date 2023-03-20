package 命令;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/20 14:46
 */

public class LightOnCommand implements Command {

	private final LightReceiver lightReceiver = new LightReceiver();

	@Override
	public void execute() {
		lightReceiver.on();
	}

	@Override
	public void undo() {
		lightReceiver.off();
	}
}