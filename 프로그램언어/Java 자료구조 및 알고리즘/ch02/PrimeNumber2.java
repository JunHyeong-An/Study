package ch02;

public class PrimeNumber2 {
	//��� �ڿ����� �� �Ѱ��� ������� �Ҽ��� ������ ǥ���� �� �ִ�.
	public static void showPrimeNumber() {
		int counter = 0;
		int ptr = 0;
		int[] prime = new int[500];
		
		prime[ptr++] = 2;
		
		for(int n = 3; n <= 1000; n+=2) {
			int i;
			for(i = 1; i < ptr; i++) {
				counter++;
				if(n % prime[i] == 0) {
					break;
				}
			}
			
			if(ptr == i)
				prime[ptr++] = n;
		}
		
		for(int i = 0; i < ptr; i++) {
			System.out.println(prime[i]);
		}
		System.out.println(counter);
	}
	
	public static void main(String[] args) {
		showPrimeNumber();
	}
}
