package ch11;

import java.util.ArrayList;
import java.util.Comparator;

class Student {
	String name;
	int ban, no, kor, eng, math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return ((int)((getTotal() / 3f) * 100)) / 100f;
	}
	
	@Override
	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," +getAverage();
	}
}

public class Quiz03 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("test3", 4, 3, 98, 50, 73));
		list.add(new Student("test1", 1, 10, 78, 80, 93));
		list.add(new Student("test2", 5, 14, 88, 90, 73));
		list.add(new Student("test5", 3, 20, 89, 70, 63));
		list.add(new Student("test4", 2, 6, 70, 66, 100));
		
		list.sort(new Comparator<Object>() {
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Student && o2 instanceof Student) {
					Student s1 = (Student)o1;
					Student s2 = (Student)o2;
					
					String str1 = s1.name;
					String str2 = s2.name;
					
					return str1.compareTo(str2);
				}
				return -1;
			};
		});
		
		for(Student s : list) {
			System.out.println(s);
		}
	}
}
