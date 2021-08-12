package ch05;

public class Gcd {
	static int gcd(int x, int y) {
		if(y == 0) return x;
		else {
			int result = gcd(y, x % y);
			System.out.println("result : " + result);
			return result;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(22, 10));
	}
}
