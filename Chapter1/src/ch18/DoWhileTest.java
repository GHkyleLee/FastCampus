package ch18;

import java.util.Scanner;

public class DoWhileTest {

	private static Scanner scanner;

	public static void main(String[] args) {

		/*
		scanner = new Scanner(System.in);
		
		int input;
		int sum = 0;
		
		input = scanner.nextInt();
		
		while(input != 0) {
			sum += input;
			input = scanner.nextInt();
		}
		
		System.out.println(sum);
		*/
		
		//do - while 버전
		
		scanner = new Scanner(System.in);
		
		int input;
		int sum = 0;
		
		input = scanner.nextInt();
		
		do {
			sum += input;
			input = scanner.nextInt();
		}while(input!=0);
		System.out.println(sum);
				
	}

}
