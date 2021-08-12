package ch05;

public class RecurX1 {
	static void recur(int n) {
		while(n > 0) {
			recur(n - 1);
			System.out.println(n);
			n -= 2;
		}
	}
	
	public static void main(String[] args) {
		recur(4);
	}
}
