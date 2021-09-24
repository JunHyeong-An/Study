package ch13;

import javax.swing.JOptionPane;

class Thread3_2 implements Runnable {
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}

public class Ex05 {
	public static void main(String[] args) {
		Thread3_2 tr = new Thread3_2();
		Thread t = new Thread(tr);
		
		t.start();
		String input = JOptionPane.showInputDialog("아무 값이나 입력해주세요");
		System.out.println(input);
	}
}
