package ch13;

public class Ex07 implements Runnable {
	static boolean autoSave = false;
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(autoSave) autoSave();
		}
	}
	
	public void autoSave() {
		System.out.println("작업 파일이 자동저장되었습니다.");
	}
	public static void main(String[] args) {
		Thread t = new Thread(new Ex07());
		t.setDaemon(true);
		t.start();
		
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+1);
			if(i == 5) autoSave = true;
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
