package ch05;

import javax.swing.JOptionPane;

public class Recur {
	static void recur(int n) {
		if(n > 0) {
			recur(n - 1);
			System.out.println(n);
			recur(n-2);
		}
	}
	
	public static void main(String[] args) {
		int input = Integer.valueOf(JOptionPane.showInputDialog("정수를 입력해주세요"));
		recur(input);
	}
}
