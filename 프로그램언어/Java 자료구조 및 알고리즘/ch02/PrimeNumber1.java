package ch02;

public class PrimeNumber1 {
	public static void showPrimeNumber() {
		int cnt = 0;
		
		for(int i = 2; i <= 10; i++) {
			int j;
			for(j = 2; j <= i-1; j++) {
				cnt++;
				if(i % j == 0) {
					break;
				}
			}
//			System.out.println("i = " + i + ", j = " + j);
			if(i == j) System.out.println(i);
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
		showPrimeNumber();
	}
}
