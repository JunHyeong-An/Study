package ch02;

public class PrimeNumberPrac1 {
	public static void showPrimeNumber() {
		int[] primes = new int[500];
		int ptr = 0;
		
		primes[ptr++] = 2;
		
		for(int i = 3; i <= 100; i+=2) {
			int j;
			
			for(j = 1; j < ptr; j++) {			// j�� �ݺ��� ������ �ɶ� 1�� ������ ���·� �������ȴ�. ptr�� ���� ������ ���� ����Ű�� �ִ�. ���� ptr�ϳ� �������� �����ش�.
				if(i % primes[j] == 0) break; // 2�� ������ �� �ǹ̰� ����
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
