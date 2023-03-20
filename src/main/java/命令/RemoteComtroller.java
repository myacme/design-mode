package 命令;


import java.util.ArrayList;
import java.util.List;

/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/20 14:49
 */

public class RemoteComtroller {

	private final List<Command> onCommand = new ArrayList<>(5);

	private final List<Command> offCommand = new ArrayList<>(5);

	private Command execute = new NoCommand();

	public RemoteComtroller() {
		for (int i = 0; i < 5; i++) {
			onCommand.add(i, new NoCommand());
			offCommand.add(i, new NoCommand());
		}
	}

	public void setCommand(int index, Command on, Command off) {
		onCommand.add(index, on);
		offCommand.add(index, off);
	}

	public void onButten(int index) {
		Command command = onCommand.get(index);
		command.execute();
		execute = command;
	}

	public void offButten(int index) {
		Command command = offCommand.get(index);
		command.execute();
		execute = command;
	}

	public void undo() {
		execute.undo();
	}
}