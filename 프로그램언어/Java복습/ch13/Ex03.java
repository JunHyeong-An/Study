package ch13;

class Thread3_1 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("|"));
		}
		
		System.out.println("소요시간2 :" + (System.currentTimeMillis() - Ex03.startTime));
	}
}

public class Ex03 {
	static long startTime = 0;
	public static void main(String[] args) {
		Thread3_1 tr = new Thread3_1();
		Thread t = new Thread(tr);
		startTime = System.currentTimeMillis();
		
		t.start();
		
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		
		System.out.println("소요시간1 :" + (System.currentTimeMillis() - Ex03.startTime));
	}
	
}
