package ch14;

import java.util.Scanner;

public class IfElseTest {

	private static Scanner scanner;

	public static void main(String[] args) {
				
		int age;
		
		System.out.println("나이를 입력해주세요. :");
		
		scanner = new Scanner(System.in);
		
		try {
		age = scanner.nextInt();
		
		if (age > 8) {
			System.out.println("학교에 가야됩니다.");
		}
		else {
			System.out.println("노는게 제일좋아");
			
		}
		
		System.out.println("열심히 살자");
		}
		catch (Exception e) {
			System.out.println("숫자만 입력하세요.");
		}
	}

}
