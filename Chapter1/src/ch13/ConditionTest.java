package ch13;

import java.util.Scanner;

public class ConditionTest {

	private static Scanner scanner;

	public static void main(String[] args) {
	
		int max;
		
		System.out.println("입력 받은 두 수중 큰 수를 출력하시오 ! \n");
		
		scanner = new Scanner(System.in);

		System.out.println("입렵 1 :");
		int num1 = scanner.nextInt();
		
		System.out.println("입렵 2 :");
		int num2 = scanner.nextInt();	
		
		max = ( num1 > num2) ? num1 : num2;  // 삼항 연산자 num1 > num2 보다 크면 num1 을 출력 그렇지 않으면 num2 출력
		
		System.out.println(max);
	
	}

}
