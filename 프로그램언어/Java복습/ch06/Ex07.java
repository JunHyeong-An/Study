package ch06;

class Data{ int x;}

public class Ex07 {
	public static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}
	
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("before d.x : " + d.x);
		
		change(d.x);
		System.out.println("after d.x : " + d.x);
	}
}
