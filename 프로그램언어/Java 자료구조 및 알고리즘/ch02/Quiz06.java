package ch02;

public class Quiz06 {
	static int convertNDigit(int x, int r, char[] d) {
		String dchar = "0123456789ABCDEFHGIJKLMNOPQRSTUVWXYZ";
		String result = "";
		int digits = 0;
		do {
			result += dchar.charAt(x % r);
			x /= r;
			digits++;
		} while(x != 0);
		
		for(int i = 0; i < d.length; i++) {
			d[i] = result.charAt(i);
			System.out.println(d[i]);
		}
		
		return digits;
	}
	
	public static void main(String[] args) {
		int x = 25;
		int r = 2;
		char[] d = new char[5];
		
		System.out.println(convertNDigit(x, r, d));
	}
}
