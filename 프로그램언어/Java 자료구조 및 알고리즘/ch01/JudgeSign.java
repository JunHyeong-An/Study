package ch01;

import java.util.Scanner;

public class JudgeSign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.print("수를 입력해 주세요 : ");
		a = sc.nextInt();
		
		if(a > 0) {
			System.out.println("양수입니다.");
		}
		else if(a < 0) {
			System.out.println("음수입니다.");
		}
		else {
			System.out.println("0입니다.");
		}
		
		sc.close();
	}
}
