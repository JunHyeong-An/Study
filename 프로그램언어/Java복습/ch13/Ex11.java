package ch13;

class Ex11_1 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
		}
	}
}

class Ex11_2 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("|");
		}
	}
}

public class Ex11 {
	static long startTime = 0;
	public static void main(String[] args) {
		Thread t1 = new Ex11_1();
		Thread t2 = new Ex11_2();
		
		startTime = System.currentTimeMillis();
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("running Time : " + (System.currentTimeMillis() - startTime));
	}
}
