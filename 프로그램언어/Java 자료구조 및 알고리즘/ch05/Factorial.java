package ch05;

import javax.swing.JOptionPane;

public class Factorial {
//	static int factorial(int n) {
//		if(n > 0) {
//			int r = n * factorial(n - 1);
//			System.out.printf("%d * %d\n", n, factorial(n - 1));
//			return r;
//		}
//		else return 1;
//	}
//	public static void main(String[] args) {
//		int num = Integer.valueOf(JOptionPane.showInputDialog("정수를 입력해주세요"));
//		
//		int result = factorial(num);
//		System.out.println(result);
//		 
//	}
	
	static int factorial(int n) {
		int num = 0;
		while(n > 0) num += n--;
		return num;
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
}
