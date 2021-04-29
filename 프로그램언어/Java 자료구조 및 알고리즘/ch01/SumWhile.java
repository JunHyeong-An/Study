package ch01;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		int n;
		int result = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		n = sc.nextInt();
		
		while(cnt <= n) {
			result += cnt++;
		}
		System.out.println(result);
		sc.close();
	}
	
}
