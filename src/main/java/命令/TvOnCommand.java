package 命令;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/20 14:46
 */

public class TvOnCommand implements Command {

	private final TvReceiver tvReceiver = new TvReceiver();

	@Override
	public void execute() {
		tvReceiver.on();
	}

	@Override
	public void undo() {
		tvReceiver.off();
	}
}