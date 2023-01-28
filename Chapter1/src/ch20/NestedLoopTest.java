package ch20;

import javax.naming.CompoundName;

//구구단 놀이
public class NestedLoopTest {

	public static void main(String[] args) {
		
		int dan;
		int count = 1;
		
		for(dan = 2; dan <= 9; dan++) {
			
			for(count =1; count <= 9; count++) {
				System.out.println( dan + " X " + count + "=" + dan*count);
			}
		}
		dan = 2;

		while(dan <= 9) {
			count = 1;
			
			while(count <=9) {			
				System.out.print(dan + "X" + count + "=" +dan*count +" ");
				count++;				
			}
			dan++;
			System.out.println("");
		}
		
		dan = 2;
		count = 1;
			
		while(dan <= 9 || count<=9)	{
			dan = 2;
			while(dan <=9) {			
				System.out.print(dan + "X" + count + "=" +dan*count +" ");
				dan++;				
			}
			count++;
			System.out.println("");
		}
	}

}
