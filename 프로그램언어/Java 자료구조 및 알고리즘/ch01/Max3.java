package ch01;

import java.util.Scanner;

public class Max3 {
	// ���� Ǭ Ǯ��
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
		// ���� Ǭ Ǯ��
//		int max = maxOfThree(9, 8, 3);
//		System.out.println(max);
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("a�� �� : ");
		a = sc.nextInt();
		
		System.out.print("b�� �� : ");
		b = sc.nextInt();
		
		System.out.print("c�� �� : ");
		c = sc.nextInt();
		
		int max = a;
		
		if(max < b) max = b;
		if(max < c) max = c;
		
		System.out.println("�ִ��� " + max +"�Դϴ�.");
		
		sc.close();
	}
}
















