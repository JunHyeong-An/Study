package day16;

public class SingletonTest {
	private static SingletonTest instance;
	
	private SingletonTest() {		// 외부에서는 생성자를 호출 할 수 없다.
		System.out.println("생성자 호출!!");
	}
	
	public static SingletonTest getInstance() {
		if(instance == null) {
			instance = new SingletonTest();
		}
		return instance;
	}
}
