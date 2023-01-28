package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		boolean flag = (num1 > 0) || (( num2 = num2 + 2 ) < 30);
		
		
		System.out.println(flag);
		System.out.println(num1);
		System.out.println(num2);
		
		boolean flag2 = (num1 > 0) && (( num2 = num2 + 2 ) < 10);
		
		System.out.println(flag2);
		System.out.println(num1);
		System.out.println(num2);

	}

}
