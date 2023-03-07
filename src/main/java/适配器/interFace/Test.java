package 适配器.interFace;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2022/10/31 15:33
 */

public class Test {

	public static void main(String[] args) {
		System.out.println("===接口适配器===");
		new AbsAdapter(){
			@Override
			public void m1() {
				System.out.println("重写m1方法");
			}
		}.m1();
	}
}