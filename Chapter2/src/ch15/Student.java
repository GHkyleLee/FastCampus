package ch15;

public class Student {
	
	String name;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void take(Trans trans) {
		this.money -= trans.price;
		
	}
	public void showInfo() {
		System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
	}
	
}
