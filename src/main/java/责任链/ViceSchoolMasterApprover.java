package 责任链;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/24 15:13
 */

public class ViceSchoolMasterApprover extends Approver {

	public ViceSchoolMasterApprover(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getPrice() > 10000 && request.getPrice() <= 20000) {
			System.out.println(this.getName() + " 采购");
		} else {
			System.out.println(this.getName() + " 无法处理->");
			this.getApprover().processRequest(request);
		}
	}
}