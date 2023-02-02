package ch03;

public class VIPCustomer extends Customer {
	
	private String agentID;
	double salesRatio;
	
	
	public VIPCustomer() {
		// super();   <<- 컴파일러가 알아서 상위 클래스 호출
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		System.out.println("VIPCoustomer() call"); 
	}
	
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);  // <<- 상위 클래스 호출하여 전달
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		System.out.println("VIPCoustomer(int, String) call");
	}
	
	public String getAgentId() {
		return agentID;
	}
	
}
