package ch02;

public class PrimeNumberPrac2 {
	public static void showPrimeNumber() {
		// �⺻������ ����� �̷� : ������
		// ��� �ڿ����� �Ҽ��� ������ �̷�����ִ�.
		int cnt = 0;
		int[] primes = new int[500];	// �Ҽ��� ��� �迭
		int ptr = 0;					// primes�� �ε���
		
		primes[ptr++] = 2;				// 2�� �Ҽ��ϱ� ó���� �־��ش�. �׸��� ���������ڸ� ����ؼ� ptr���� 1���������ش�.
										// 4�̻��� �ڿ����� ���� �Ҽ��� �� �� ����. ���ڷ� 2�� ������ ������ ����.
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
		System.out.println("����Ƚ�� : " + cnt);
	}
	public static void main(String[] args) {
		showPrimeNumber();
	}
}
