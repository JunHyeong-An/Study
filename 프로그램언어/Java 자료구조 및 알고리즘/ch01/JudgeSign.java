package ch01;

import java.util.Scanner;

public class JudgeSign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.print("���� �Է��� �ּ��� : ");
		a = sc.nextInt();
		
		if(a > 0) {
			System.out.println("����Դϴ�.");
		}
		else if(a < 0) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("0�Դϴ�.");
		}
		
		sc.close();
	}
}
