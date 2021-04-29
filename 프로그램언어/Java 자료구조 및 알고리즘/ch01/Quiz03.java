package ch01;

import java.util.Scanner;

public class Quiz03 {
	public static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if(min > b) min = b;
		if(min > c) min = c;
		if(min > d) min = d;
		
		return min;
	}
	
	// 네 값의 최솟값을 구하는 min4메서드를 작성
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.print("a의 값은 : ");
		a = sc.nextInt();
		System.out.print("b의 값은 : ");
		b = sc.nextInt();
		System.out.print("c의 값은 : ");
		c = sc.nextInt();
		System.out.print("d의 값은 : ");
		d = sc.nextInt();
		
		int result = min4(a, b, c, d);
		System.out.println("최솟값은 " + result + "입니다.");
		
		sc.close();
	}
}
