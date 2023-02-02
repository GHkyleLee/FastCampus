package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		
		/*
		 Customer customerLee = new Customer(); customerLee.setCustomerName("이순신");
		 customerLee.setCustomerID(10010); customerLee.bonusPoint = 1000;
		 System.out.println(customerLee.showCustomerInfo());
		 
		 VIPCustomer customerKim = new VIPCustomer();
		 customerKim.setCustomerName("김유신"); customerKim.setCustomerID(10020);
		 customerKim.bonusPoint = 1000;
		 System.out.println(customerKim.showCustomerInfo());
		 
		*/
		System.out.println("=============================================");
		
		Customer customerYun = new Customer(1030, "윤두준");
		customerYun.bonusPoint = 1000;
		int price = customerYun.calcPrice(1000);
		System.out.println(customerYun.showCustomerInfo()+ price);
		
		VIPCustomer customerKang = new VIPCustomer(1040, "강호동");
		customerKang.bonusPoint = 1000;
		price = customerKang.calcPrice(1000);
		System.out.println(customerKang.showCustomerInfo()+ price);
		
		System.out.println("=============================================");
		
		Customer vc = new VIPCustomer(12345, "noname");
		price = vc.calcPrice(1000);
		System.out.println(vc.showCustomerInfo() + price);
	}
}
