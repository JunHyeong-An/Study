package ch01;

import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("�� �� : ");
		num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				System.out.print("* ");
			}System.out.println();
		}
		sc.close();
	}
}
