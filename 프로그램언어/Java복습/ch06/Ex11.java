package ch06;

class Data1 {
	int value;
}

class Data2 {
	int value;
	
	public Data2() {}
	public Data2(int x) {
		value = x;
	}
}

public class Ex11 {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2();
		Data2 d3 = new Data2(5);
		
		System.out.println(d1.value);
		System.out.println(d2.value);
		System.out.println(d3.value);
	}
}
