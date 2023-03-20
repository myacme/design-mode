package 命令;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/20 14:42
 */

public interface Command {

	void execute();

	void undo();
}