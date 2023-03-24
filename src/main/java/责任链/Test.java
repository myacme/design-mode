package 责任链;


/**
 * @author ljx
 * @version 1.0.0
 * @create 2023/3/24 15:26
 */

public class Test {

	public static void main(String[] args) {
		PurchaseRequest request = new PurchaseRequest("设备采购", 6000);
		DepartmentApprover departmentApprover = new DepartmentApprover("系主任");
		CollageApprover collageApprover = new CollageApprover("院长");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("副校长");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");
		//生产责任链  --环形责任链
		departmentApprover.setApprover(collageApprover);
		collageApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(departmentApprover);
		//调用
		schoolMasterApprover.processRequest(request);
	}
}