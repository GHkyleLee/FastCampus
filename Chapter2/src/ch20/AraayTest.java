package ch20;

public class AraayTest {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int total = 0;
		
		for(int i = 0, num = 1; i<arr.length; i++) {
			arr[i] = num++;
		}
		
		for(int num : arr) {
			total += num;
		}
		
		System.out.println(total);
		System.out.println("=====================");
		
		double[] dArr = new double[5];
		
		dArr[0] = 1.1; 
		dArr[1] = 2.1;
		dArr[2] = 3.1;
		
		double mtotal = 1;
		for(int i =0; i<dArr.length; i++) {
			mtotal *=dArr[i];
		}
		
		System.out.println(mtotal);
		System.out.println("=====================");
		
		double[] SArr = new double[5];
		
		int count = 0;
		SArr[0] = 1.1; 
		count++;
		SArr[1] = 2.1;
		count++;
		SArr[2] = 3.1;
		count++;
		
		double stotal = 1;
		for(int i =0; i<count; i++) {
			stotal *=SArr[i];
		}
		
		System.out.println(stotal);
		System.out.println("=========================================");

	}

}
