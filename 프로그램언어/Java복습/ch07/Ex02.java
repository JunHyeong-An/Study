package ch07;

class Parent {
	int x = 10;
}

class child extends Parent{
	int x = 20;	// this.x
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		child c = new child();
		
		c.method();
		
	}
}
