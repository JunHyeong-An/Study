package ch02;

import java.util.Scanner;

public class Quiz07 {
	public static String convertNDigits(int x, int r) {
		String result = "";
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
//		System.out.println(r + " |   " + x);
//		System.out.println("  +--------");
		do {
			result = dchar.charAt(x % r) + result;
			
			if(x >= r) {
				System.out.printf("%2d |   %2d   ...%d\n", r, x, (x % r));
				System.out.println("   +--------");
			}
			else System.out.println("        " + (x));
			x /= r;
		} while(x != 0);
		return result;
	}
	
	public static void showDigits(String digits, int x, int r) {
		for(int i = 0; i < digits.length(); i++ ) {
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, r;
		System.out.println("10진수를 기수 변환합니다.");
		System.out.print("변환하는 음이 아닌 정수 : ");
		x = sc.nextInt();
		System.out.print("어떤 진수로 변환할 까요 : ");
		r = sc.nextInt();
		
		System.out.println(r + "진수로는 : " + convertNDigits(x, r) + "입니다.");
		
		
		
	}
}
