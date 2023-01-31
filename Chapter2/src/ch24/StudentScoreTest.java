package ch24;

public class StudentScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student(1001, "김기리");
		student1.addSubject("국어", 100);
		student1.addSubject("수학", 90);
		student1.addSubject("영어", 95);
		student1.addSubject("과학", 80);
		
		student1.showScoreInfo();
		
		System.out.println("====================");
		
		Student student2 = new Student(1002, "홍대광");
		student2.addSubject("역사", 99);
		student2.addSubject("한국사", 99);
		student2.addSubject("세계사", 89);
		student2.addSubject("외국어", 59);
		
		student2.showScoreInfo();
	}

}
