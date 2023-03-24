package 责任链;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/24 15:13
 */

public class SchoolMasterApprover extends Approver {

	public SchoolMasterApprover(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getPrice() > 20000) {
			System.out.println(this.getName() + " 采购");
		} else {
			System.out.println(this.getName() + " 无法处理->");
			this.getApprover().processRequest(request);
		}
	}
}