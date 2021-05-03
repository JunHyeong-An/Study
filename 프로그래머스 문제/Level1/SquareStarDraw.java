package level01;

import java.util.Scanner;

public class SquareStarDraw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("별의 갯수 입력 : ");
		int a = sc.nextInt();

		System.out.print("줄 수 입력 : ");
        int b = sc.nextInt();

        for(int i = 0; i < b; i++) {
        	for(int j = 0; j < a; j++) {
        		System.out.print("*");
        	}System.out.println();
        }
        
        sc.close();
	}
}
