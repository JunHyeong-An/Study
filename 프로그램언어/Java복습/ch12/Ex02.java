package ch12;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	String name = "";
	int ban;
	int no;
	
	public Student(String name, int ban, int no) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("홍길동", 1, 10));
		list.add(new Student("이길동", 1, 12));
		
		Iterator<Student> it = list.iterator();
		
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.name);
		}
	}
}
