package ch01;

import java.util.Scanner;

public class TriangleLB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("´Ü ¼ö : ");
		num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				if(j > i) System.out.print("");
				else System.out.print("* ");
			}System.out.println();
		}
		
	}
}
