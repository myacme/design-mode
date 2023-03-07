package 原型;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/26 15:17
 */

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		//浅拷贝
		Sheep sheep = new Sheep("肖恩", 1, "白色");
		System.out.println(sheep.clone());
		//深拷贝
		//方法一  重写clone（）
		SheepDeepClone sheepDeepClone = new SheepDeepClone("小羊", 8, "黑色", sheep);
		SheepDeepClone clone = (SheepDeepClone) sheepDeepClone.clone();
		System.out.println(sheepDeepClone.getChildren() == clone.getChildren());
		//方法二  序列化
		SheepDeepClone deepClone = sheepDeepClone.deepClone();
		System.out.println(sheepDeepClone == deepClone);
	}
}