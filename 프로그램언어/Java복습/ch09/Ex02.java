package ch09;

class Person {
	long id;
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return id == ((Person)obj).id;	// 선언한 person의 id와 매개변수로 받아온 person의 id값이 같은지 비교해서 boolean값을 넘겨줌
		else 
			return false;
	}
	
	public Person(long id) {
		this.id = id;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Person p1 = new Person(10);
		Person p2 = new Person(10);
		
		System.out.println(p1.equals(p2));
	}
}
