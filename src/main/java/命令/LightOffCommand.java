package 命令;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/20 14:46
 */

public class LightOffCommand implements Command {

	private final LightReceiver lightReceiver = new LightReceiver();

	@Override
	public void execute() {
		lightReceiver.off();
	}

	@Override
	public void undo() {
		lightReceiver.on();
	}
}