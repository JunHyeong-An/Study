package ch01;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("���ڸ� ������ �Է����ּ��� : ");
			num = sc.nextInt();
		} while(num <= 9 || num >= 100);
		System.out.println(num);
		
		sc.close();
	}
}
