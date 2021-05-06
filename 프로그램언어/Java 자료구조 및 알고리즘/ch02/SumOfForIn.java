package ch02;

public class SumOfForIn {
	public static void main(String[] args) {
		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		for(int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] : %.2f\n", i, a[i]);
		}
		
		int result = 0;
		for(double d : a) 
			result += d;
		
		System.out.println("모든 요소의 합은 " + result + "입니다.");
	}
}
