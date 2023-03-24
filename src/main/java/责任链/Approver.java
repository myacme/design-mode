package 责任链;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/24 15:13
 */

public abstract class Approver {

	private String name;
	private Approver approver;

	public Approver(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Approver getApprover() {
		return approver;
	}

	public void setApprover(Approver approver) {
		this.approver = approver;
	}

	public abstract void processRequest(PurchaseRequest request);
}