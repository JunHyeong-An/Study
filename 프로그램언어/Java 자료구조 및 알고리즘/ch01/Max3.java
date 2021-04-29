package ch01;

import java.util.Scanner;

public class Max3 {
	// 내가 푼 풀이
//	public static int maxOfThree(int a, int b, int c) {
//		int max = a;
//		
//		if(max < b) max = b;
//		if(max < c) max = c;
//		
//		return max;
//	}
//	
	public static void main(String[] args) {
		// 내가 푼 풀이
//		int max = maxOfThree(9, 8, 3);
//		System.out.println(max);
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("a의 값 : ");
		a = sc.nextInt();
		
		System.out.print("b의 값 : ");
		b = sc.nextInt();
		
		System.out.print("c의 값 : ");
		c = sc.nextInt();
		
		int max = a;
		
		if(max < b) max = b;
		if(max < c) max = c;
		
		System.out.println("최댓값은 " + max +"입니다.");
		
		sc.close();
	}
}
















