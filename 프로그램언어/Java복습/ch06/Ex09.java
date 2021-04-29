package ch06;

class MyMath2 {
	long a, b;
	
	long add() {return a + b;}
	long subtract() {return a - b;}
	long devide() {return a / b;}
	long mulitple() {return a * b;}
	
	static long add(long a, long b) {return a + b;}
	static long subtract(long a, long b) {return a - b;}
	static long devide(long a, long b) {return a / b;}
	static long mulitple(long a, long b) {return a * b;}
	
}

public class Ex09 {
	public static void main(String[] args) {
		System.out.println(MyMath2.add(100L, 200L));
		System.out.println(MyMath2.subtract(100L, 200L));
		System.out.println(MyMath2.devide(100L, 200L));
		System.out.println(MyMath2.mulitple(100L, 200L));
		
		MyMath2 mm = new MyMath2();
		
		mm.a = 100L;
		mm.b = 300L;
		
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.devide());
		System.out.println(mm.mulitple());
	}
}
