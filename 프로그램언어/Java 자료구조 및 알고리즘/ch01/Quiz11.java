package ch01;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� :");
		int num = sc.nextInt();
		int cnt = 1;
		
		while(num >= 10) {
			num /= 10;
			cnt++;
		}
		
		System.out.println(cnt + "�ڸ��� �Դϴ�.");
		sc.close();
	}
}
