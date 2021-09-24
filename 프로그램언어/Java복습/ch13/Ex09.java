package ch13;

import javax.swing.JOptionPane;

class Ex09_1 extends Thread {
	public void run() {
		int cnt = 1;
		while(!isInterrupted()) {
			System.out.println(cnt++);
			for(int i = 0; i < 250000000l; i++);
		}
	}
}

public class Ex09 {
	public static void main(String[] args) {
		Thread t1 = new Ex09_1();

		t1.start();

		String input = JOptionPane.showInputDialog("값을 입력해주세요");

		System.out.println("입력하신 값은 " + input + "입니다.");
		t1.interrupt();
		System.out.println("isInterrupted():" + t1.isInterrupted());
		System.out.println("Count End");
	}
}