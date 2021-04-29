package ch01;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 :");
		int num = sc.nextInt();
		int cnt = 1;
		
		while(num >= 10) {
			num /= 10;
			cnt++;
		}
		
		System.out.println(cnt + "자리수 입니다.");
		sc.close();
	}
}
