package ch02;

public class PrimeNumPrac4 {
	// 1000������ �Ҽ��� ��� ���
	public static void showPrimeNum() {
		int[] primes = new int[500];
		int ptr = 0;
		
		
		primes[ptr++] = 2;
		primes[ptr++] = 3;
		
		for(int i = 5; i <= 1000; i+=2) {
			boolean flag = false;	//********flag �ִ°� �ٽ�
			for(int j = 1; primes[j]*primes[j] <= i; j++) {
				if(i % primes[j] == 0) {
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
	}
	
	
	public static void main(String[] args) {
		showPrimeNum();
	}
}
