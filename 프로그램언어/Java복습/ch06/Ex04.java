package ch06;

class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result;
	}
	
	long subtract(long a, long b) {
		long result = a - b;
		return result;
	}
	
	long multiply(long a, long b) {
		long result = a * b;
		return result;
	}
	
	long divide(long a, long b) {
		long result = a / b;
		return result;
	}
}

public class Ex04 {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		System.out.println(mm.add(3, 4));
		System.out.println(mm.subtract(3, 4));
		System.out.println(mm.multiply(3, 4));
		System.out.println(mm.divide(3, 4));
	}
}
