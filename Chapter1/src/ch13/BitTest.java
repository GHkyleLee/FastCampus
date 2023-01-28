package ch13;

public class BitTest {

	public static void main(String[] args) {
		
		int num1 = 5;	//	00000101
		int num2 = 10;	//	00001010
		
		System.out.println( num1 | num2);
		System.out.println( num1 & num2);
		System.out.println( num1 ^ num2);
		System.out.println(~num1);

		System.out.println(num1 << 2);	// 2의 2제곱으로 곱해짐(2비트를 밀음)  00000101 -> 000010100  
		System.out.println(num1);
		System.out.println(num1 >> 2);	// 00000101 -> 000000001  
		System.out.println(num1 <<= 2);	// 복합 대입 연산자 
		System.out.println(num1);
		
	}

}
