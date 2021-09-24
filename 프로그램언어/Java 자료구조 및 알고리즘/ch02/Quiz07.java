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
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
		x = sc.nextInt();
		System.out.print("� ������ ��ȯ�� ��� : ");
		r = sc.nextInt();
		
		System.out.println(r + "�����δ� : " + convertNDigits(x, r) + "�Դϴ�.");
		
		
		
	}
}
