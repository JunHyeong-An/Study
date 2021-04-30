package ch02;

import java.util.Scanner;

public class CardConvRev {
	static String cardConvRev(int x, int r) {
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String result = "";
		
		do {
			result = dchar.charAt(x % r) + result;
			x /= r;
		} while(x != 0);
		
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int r;
		int menu;
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			System.out.print("���� �ƴ� �����Է� : ");
			x = sc.nextInt();
			System.out.print("�� ������ ��ȯ �ұ��? : ");
			r = sc.nextInt();
			System.out.println(r + "�����δ� " + cardConvRev(x, r) + "�Դϴ�.");
			System.out.print("�ѹ��� ��ȯ �ұ��? (1.�� 2.�ƴϿ�) : ");
			menu = sc.nextInt();
		} while(menu != 2);
		System.out.println("�����մϴ�.");
		sc.close();
	}
}
