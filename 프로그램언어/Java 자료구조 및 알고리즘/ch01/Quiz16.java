package ch01;

import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("´Ü ¼ö : ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n * 2 - 1; j++) {
				if(j + i < n-1) System.out.print(" ");
				else if(j - i >= n) System.out.print(" ");
				else System.out.print("*");
			}System.out.println();
		}
	}
}
