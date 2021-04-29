package ch01;

public class Median {
	public static int medain(int a, int b, int c) {
		
		// a >= b >= c, a >= c >= b, c >= a >= b
		
		if(a >= b) {
			if(b >= c) {	// 경우의 수 중에서 마지막에 있는 숫자와 이제 비교시작하는 숫자를 먼저 비교해준다.(대소관계 파악)
				return b;
			}
			else if(a >= c) {
				return c;
			}
			else {
				return b;
			}
		}
		// b > a
		// b > a > c, b > c > a, c > b > a
		else if(a > c) {
			return a;
		}
		else if(c > b) {
			return b;
		}
		else {
			return c;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(medain(2, 5, 6));
		System.out.println(medain(5, 6, 7));
		System.out.println(medain(213, 3654, 123));
		System.out.println(medain(354, 235, 556));
		System.out.println(medain(12, 45, 26));
		
	}
}
