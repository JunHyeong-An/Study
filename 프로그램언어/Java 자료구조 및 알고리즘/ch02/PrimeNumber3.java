package ch02;

public class PrimeNumber3 {
	public static void showPrimeNumber() {
		// i의 제곱근 이하의 소수로는 절대 나누어 떨어지지 않은다. == 소수
		int ptr = 0;
		int cnt = 0;
		int[] primes = new int[500];
		
		primes[ptr++] = 2;
		primes[ptr++] = 3;
		
		for(int i = 5; i < 1000; i+=2) {
			boolean flag = false;
			
			for(int j = 1; primes[j] * primes[j] <= i; j++) {
				cnt += 2;
				if(i % primes[j] == 0) { 
					cnt++;
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				primes[ptr++] = i;
			}
		}
		for(int i = 0; i < ptr; i++) {
			System.out.println(primes[i]);
		}
		System.out.println("연산 횟수 : " + cnt);
		
	}
	
	public static void main(String[] args) {
		showPrimeNumber();
	}
}
