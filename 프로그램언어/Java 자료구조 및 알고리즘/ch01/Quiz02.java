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
		
		System.out.print("a�� ���� : ");
		a = sc.nextInt();
		System.out.print("b�� ���� : ");
		b = sc.nextInt();
		System.out.print("c�� ���� : ");
		c = sc.nextInt();
		
		int result = min3(a, b, c);
		System.out.println("�ּڰ��� " + result + "�Դϴ�.");
		
		sc.close();
	}
}
