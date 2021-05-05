package ch02;

public class PrimeNumberPrac1 {
	public static void showPrimeNumber() {
		int[] primes = new int[500];
		int ptr = 0;
		
		primes[ptr++] = 2;
		
		for(int i = 3; i <= 100; i+=2) {
			int j;
			
			for(j = 1; j < ptr; j++) {			// j는 반복이 마무리 될때 1이 증가된 상태로 마무리된다. ptr은 값이 들어가야할 곳을 가리키고 있다. 따라서 ptr하나 전까지만 비교해준다.
				if(i % primes[j] == 0) break; // 2로 나누는 건 의미가 없음
			}
			if(j == ptr) primes[ptr++] = i;
		}
		
		for(int i = 0; i < ptr; i++) {
			System.out.println(primes[i]);
		}
	}
	
	public static void main(String[] args) {
		showPrimeNumber();
	}
}
