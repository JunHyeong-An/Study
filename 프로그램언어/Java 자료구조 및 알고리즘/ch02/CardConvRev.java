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
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			System.out.print("음이 아닌 정수입력 : ");
			x = sc.nextInt();
			System.out.print("몇 진수로 변환 할까요? : ");
			r = sc.nextInt();
			System.out.println(r + "진수로는 " + cardConvRev(x, r) + "입니다.");
			System.out.print("한번더 변환 할까요? (1.네 2.아니요) : ");
			menu = sc.nextInt();
		} while(menu != 2);
		System.out.println("종료합니다.");
		sc.close();
	}
}
