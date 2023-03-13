package 装饰者;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/13 15:39
 */

public class Jdk {

	/**
	 * FilterInputStream 装饰者抽象类
	 * DataInputStream  装饰者
	 * FileInputStream 被装饰者
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		DataInputStream dataInputStream = new DataInputStream(new FileInputStream(""));
	}
}