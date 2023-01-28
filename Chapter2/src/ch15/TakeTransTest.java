package ch15;

public class TakeTransTest {

	public static void main(String[] args) {

		Student student = new Student("Edward", 20000);
		Trans trans = new Trans("잘 간다", 0, 10000);
		
		student.take(trans);
		trans.take(trans.price);
		
		student.showInfo();
		trans.showInfo();
		
	}

}
