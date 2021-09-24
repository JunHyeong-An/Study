package ch11;

import java.util.ArrayList;
import java.util.Comparator;

public class Quiz04 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("test3", 1, 3, 98, 50, 73));
		list.add(new Student("test1", 2, 10, 78, 80, 93));
		list.add(new Student("test2", 1, 14, 88, 90, 73));
		list.add(new Student("test5", 1, 20, 89, 70, 63));
		list.add(new Student("test4", 2, 6, 70, 66, 100));
		
		list.sort(new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				Student s1 = (Student)o1;
				Student s2 = (Student)o2;
				
				Integer ban1 = s1.ban;
				Integer ban2 = s2.ban;
				
				Integer no1 = s1.no;
				Integer no2 = s2.no;
				
				int flag = ban1.compareTo(ban2); 
				
				if(flag == 0) {
					return no1.compareTo(no2);
				}
				
				return flag;
			}
		});
		
		for(Student s : list) {
			System.out.println(s);
		}
	}
}
