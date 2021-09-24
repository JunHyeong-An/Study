package ch01;

public class Quiz09 {
	public static int sumOf(int a, int b) {
		int sum = 0;
		for(int i = a + 1; i < b; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumOf(1, 5));
		System.out.println(sumOf(2, 5));
	}
}
