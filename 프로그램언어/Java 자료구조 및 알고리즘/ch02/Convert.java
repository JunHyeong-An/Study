package ch02;

public class Convert {
	public static void convert(int x, int r) {
		String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String result = "";
		do {
			result = digits.charAt(x % r) + result;
			x /= r;
		} while(x != 0);
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		convert(45, 16);
	}
}
