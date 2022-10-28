package prototype;


import java.io.*;

/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/26 15:05
 */

public class SheepDeepClone implements Cloneable, Serializable {

	private String name;
	private int age;
	private String color;

	private Sheep children;

	public SheepDeepClone(String name, int age, String color, Sheep children) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.children = children;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Sheep getChildren() {
		return children;
	}

	public void setChildren(Sheep children) {
		this.children = children;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		SheepDeepClone sheepDeepClone = (SheepDeepClone) super.clone();
		sheepDeepClone.children = (Sheep) this.children.clone();
		return sheepDeepClone;
	}

	@Override
	public String toString() {
		return "SheepDeepClone{" +
				"name='" + name + '\'' +
				", age=" + age +
				", color='" + color + '\'' +
				", children=" + children +
				'}';
	}

	public SheepDeepClone deepClone() {
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			//序列化
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			//反序列化
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			return (SheepDeepClone) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				ois.close();
				bis.close();
				oos.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}