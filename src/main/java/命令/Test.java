package 命令;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/20 14:56
 */

public class Test {

	public static void main(String[] args) {
		RemoteComtroller remoteComtroller = new RemoteComtroller();
		remoteComtroller.setCommand(0, new LightOnCommand(), new LightOffCommand());
		remoteComtroller.onButten(0);
		remoteComtroller.undo();
		remoteComtroller.setCommand(1, new TvOnCommand(), new TvOffCommand());
		remoteComtroller.offButten(1);
		remoteComtroller.undo();
	}
}