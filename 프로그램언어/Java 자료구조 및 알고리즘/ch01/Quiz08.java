package ch01;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt, sum = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		cnt = sc.nextInt();
		
		if(cnt % 2 == 0) {
			sum = (1 + cnt) * cnt / 2;
		}
		else {
			for(int i = 1; i <= cnt; i++) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
