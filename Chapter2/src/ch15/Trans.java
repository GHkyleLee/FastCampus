package ch15;

public class Trans {
	
	String transName;
	int price;
	int money;
	
	public Trans(String name, int money, int price) {
		this.transName = name;
		this.price = price;
		this.money = money;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(transName + " 운수택시 수입은 " + money + "원 입니다.");
	}

}
