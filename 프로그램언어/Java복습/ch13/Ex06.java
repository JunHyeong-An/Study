package ch13;

class ThreadEx6_1 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
			for(int j = 0; j < 10000000; j++);
		}
	}
}

class ThreadEx6_2 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("|");
			for(int j = 0; j < 10000000; j++);
		}
	}
}

public class Ex06 {
	public static void main(String[] args) {
		ThreadEx6_1 tr1 = new ThreadEx6_1();
		ThreadEx6_2 tr2 = new ThreadEx6_2();
		
		Thread t1 = new Thread(tr1);
		Thread t2 = new Thread(tr2);
		
		t1.setPriority(5);
		t2.setPriority(7);
		
		System.out.println("t1 priority :" +t1.getPriority());
		System.out.println("t2 priority :" +t2.getPriority());
		
		t1.start();
		t2.start();
	}
}
