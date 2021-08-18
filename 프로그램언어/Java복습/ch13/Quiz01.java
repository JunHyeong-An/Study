package ch13;

class Q13_1 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
		}
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Q13_1());
		t1.start();
	}
}
