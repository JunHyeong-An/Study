package ch09;

class Value {
	int value;
	
	public Value(int value) {
		this.value = value;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		System.out.println(v1.equals(v2));
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);
	}
}
