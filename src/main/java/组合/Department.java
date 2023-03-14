package 组合;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * 专业
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/14 15:14
 */

public class Department extends Component {

	List<Component> list = new ArrayList<>();

	public Department(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		this.list.add(component);
	}

	@Override
	public void print() {
		System.out.print("  ");
		super.print();
	}
}