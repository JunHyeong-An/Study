package ch13;

class Ex08_01 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) System.out.print("-");
		System.out.println("<<th1 end>>");
		try {
			Thread.sleep(2000);			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Ex08_02 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++)System.out.print("|");
		System.out.println("<<th2 end>>");
	}
}

public class Ex08 {
	public static void main(String[] args) {
		Thread th1 = new Thread(new Ex08_01());
		Thread th2 = new Thread(new Ex08_02());
		th1.start();
		th2.start();
		
		try {
//			th1.sleep(2000);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.print("<<main end>>");
	}
}
