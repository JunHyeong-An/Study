package springbook.user.proxyStudyTest;

class Person {
	void Hello() {
		System.out.println("hello");
	}
}
class P {
	
}

class Doctor extends Person {
	void Hi() {
		System.out.println("Hi");
	}
}
class Police extends Person {}

interface Thing {  // abstarct
	void price();
	void name();
}

interface t {
	void t();
}

class Tv implements Thing, t {
	@Override
	public void price() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void t() {
		// TODO Auto-generated method stub
		
	}
}

public class Test2 {
	public static void main(String[] args) {
		Doctor d = new Doctor();
		Person p = new Person();
		
		d.Hello();
	}
}
