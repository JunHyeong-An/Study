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
	
	// �� ���� �ּڰ��� ���ϴ� min4�޼��带 �ۼ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.print("a�� ���� : ");
		a = sc.nextInt();
		System.out.print("b�� ���� : ");
		b = sc.nextInt();
		System.out.print("c�� ���� : ");
		c = sc.nextInt();
		System.out.print("d�� ���� : ");
		d = sc.nextInt();
		
		int result = min4(a, b, c, d);
		System.out.println("�ּڰ��� " + result + "�Դϴ�.");
		
		sc.close();
	}
}
