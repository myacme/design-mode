package 组合;


import java.util.ArrayList;
import java.util.List;

/**
 * 学校
 *
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/14 15:14
 */

public class University extends Component {

	List<Component> list = new ArrayList<>();

	public University(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		this.list.add(component);
	}

	@Override
	public void print() {
		super.print();
		for (Component component : this.list) {
			System.out.print("  ");
			component.print();
		}
	}
}