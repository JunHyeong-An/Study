package ch01;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int n;
		System.out.print("���ڸ� �Է��ϼ��� : ");
		n = sc.nextInt();
		
		
		for(int i = 1; i <= n; i++) {
			result += i;
		}
		System.out.println(result);
		sc.close();
	}
}
