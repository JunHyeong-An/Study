package ch02;

public class PrimeNumPrac3 {
	public static void showPrimeNumber() {
		int cnt = 0;
		
		for(int i = 2; i < 100; i++) {
			int j;
			for(j = 2; j < i; j++) {
				cnt++;
				if(i % j == 0) break;
			}
			if(i == j) {
				System.out.println(i);
			}
		}
		System.out.println("¿¬»ê È½¼ö : " + cnt);
	}
	public static void main(String[] args) {
		showPrimeNumber();
	}
}
