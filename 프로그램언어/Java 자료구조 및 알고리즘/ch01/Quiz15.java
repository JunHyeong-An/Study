package ch01;

import java.util.Scanner;

public class Quiz15 {
	public static void triangleLB(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j > i) System.out.print("");
				else System.out.print("* ");
			}System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("´Ü ¼ö : ");
		n = sc.nextInt();
		
		triangleLB(n);
		sc.close();
	}
}
