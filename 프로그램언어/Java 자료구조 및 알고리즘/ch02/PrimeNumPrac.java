package ch02;

public class PrimeNumPrac {
	//��� �ڿ����� �� �Ѱ��� ������� �Ҽ��� ������ ǥ���� �� �ִ�.
	public static void showPrimeNum() {
		int cnt = 0;
		int ptr = 0;
		int[] prime = new int[500];
		
		prime[ptr++] = 2;
		
		for(int i = 3; i <= 1000; i += 2) {
			int j;
			
			for(j = 1; j < ptr; j++) {	// ���� ptr�� ���� ���ϴ� ���� �����ϱ⶧���� j < ptr�� �������� �ؾ��Ѵ�.
				cnt++;
				if(i % prime[j] == 0) break;
			}
			if(j == ptr) {				// for���� �ѹ� ���� �����⶧���� j�� �������� 1�����Ǽ� ���´�.
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
