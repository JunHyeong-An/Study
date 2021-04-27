package day16;

public class SingletonTest {
	private static SingletonTest instance;
	
	private SingletonTest() {		// �ܺο����� �����ڸ� ȣ�� �� �� ����.
		System.out.println("������ ȣ��!!");
	}
	
	public static SingletonTest getInstance() {
		if(instance == null) {
			instance = new SingletonTest();
		}
		return instance;
	}
}
