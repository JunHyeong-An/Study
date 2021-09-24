package ch01;

import java.util.Scanner;

public class SumForPos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int n;
		
		do {
			System.out.print("숫자를 입력하세요 : ");
			n = sc.nextInt();
			
			for(int i = 1; i <= n; i++) {
				result += i;
			}
		} while(n <= 0);
		System.out.println(result);
		
		sc.close();
	}
}
