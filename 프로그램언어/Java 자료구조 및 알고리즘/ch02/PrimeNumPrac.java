package ch02;

public class PrimeNumPrac {
	//모든 자연수는 꼭 한가지 방법으로 소수의 곱으로 표현할 수 있다.
	public static void showPrimeNum() {
		int cnt = 0;
		int ptr = 0;
		int[] prime = new int[500];
		
		prime[ptr++] = 2;
		
		for(int i = 3; i <= 1000; i += 2) {
			int j;
			
			for(j = 1; j < ptr; j++) {	// 지금 ptr에 지금 구하는 수가 들어가야하기때문에 j < ptr을 조건으로 해야한다.
				cnt++;
				if(i % prime[j] == 0) break;
			}
			if(j == ptr) {				// for문에 한번 들어갔다 나오기때문에 j는 마지막에 1증가되서 나온다.
				prime[ptr++] = i;
			}
		}
		
		for(int i = 0; i < ptr; i++) {
			System.out.println(prime[i]);
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
		showPrimeNum();
	}
}
