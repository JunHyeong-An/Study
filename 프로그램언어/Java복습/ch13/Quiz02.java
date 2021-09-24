package ch13;

class Thread5 extends Thread {
	public void run() {
		for(int i = 0; !Quiz02.stopped; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	};
}

public class Quiz02 {
	static boolean stopped = false;
	
	public static void main(String[] args) {
		Thread5 th1 = new Thread5();
		
		th1.start();
		
		try {
			Thread.sleep(6 * 1000);
		} catch (Exception e) {}
		
		stopped = true;
		System.out.println("stopped");
	}
}
