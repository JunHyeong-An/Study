package ch01;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, subtract = 0;
		

		System.out.print("a : ");
		a = sc.nextInt();
		
		do {
			System.out.print("b : ");
			b = sc.nextInt();
			if(a > b) System.out.println("a보다 큰값을 입력하세요!!");
		} while(b < a);
		
		subtract = b - a;
		System.out.println(subtract);
	}
}
