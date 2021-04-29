package ch01;

import java.util.Scanner;

public class Quiz02 {
	public static int min3(int a, int b, int c) {
		int min = a;
		
		if(min > b) min = b;
		if(min > c) min = c;
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("a의 값은 : ");
		a = sc.nextInt();
		System.out.print("b의 값은 : ");
		b = sc.nextInt();
		System.out.print("c의 값은 : ");
		c = sc.nextInt();
		
		int result = min3(a, b, c);
		System.out.println("최솟값은 " + result + "입니다.");
		
		sc.close();
	}
}
