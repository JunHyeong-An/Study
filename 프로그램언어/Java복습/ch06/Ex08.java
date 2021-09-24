package ch06;

public class Ex08 {
	public static void main(String[] args) {
		Data d2 = new Data();
		d2.x = 10;
		System.out.println("before d.x : " + d2.x);
		
		change(d2);
		System.out.println("after d.x : " + d2.x);
	}
	
	public static void change(Data d) {
		d.x = 1000;
	}
}
