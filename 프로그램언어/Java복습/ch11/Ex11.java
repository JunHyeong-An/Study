package ch11;

import java.util.HashSet;
import java.util.Objects;

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.name + " : " + this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		
		if(obj instanceof Person) {
			flag = this.name.equals(((Person) obj).getName()) && this.age == ((Person)obj).getAge();
		}
		
		return flag;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
}

public class Ex11 {
	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<Object>();
		
		hs.add("abc");
		hs.add("abc");
		
		hs.add(new Person("David", 10));
		hs.add(new Person("David", 10));
		
		System.out.println(hs);
	}
}
