package ch02;

public class PrimeNumberPrac2 {
	public static void showPrimeNumber() {
		// 기본적으로 사용한 이론 : 정수론
		// 모든 자연수는 소수의 곱으로 이루어져있다.
		int cnt = 0;
		int[] primes = new int[500];	// 소수를 담는 배열
		int ptr = 0;					// primes의 인덱스
		
		primes[ptr++] = 2;				// 2는 소수니까 처음에 넣어준다. 그리고 후위연산자를 사용해서 ptr값을 1증가시켜준다.
										// 4이상의 자연수는 절대 소수가 될 수 없다. 인자로 2를 무조건 가지기 때문.
		for(int i = 3; i <= 100; i+=2) {
			int j;
			for(j = 1; j < ptr; j++) {
				cnt++;
				if(i % primes[j] == 0) break;
			}
			
			if(j == ptr) primes[ptr++] = i;
		}
		for(int i = 0; i < ptr; i++) {
			System.out.println(primes[i]);
		}
		System.out.println("연산횟수 : " + cnt);
	}
	public static void main(String[] args) {
		showPrimeNumber();
	}
}
