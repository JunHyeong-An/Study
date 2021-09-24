package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test1 {
	public static void main(String[] args) {
		Human h1 = new Human("������", 39);
		Human h2 = new Human("����", 40);
		Human h3 = new Human("����", 44);
		Human h4 = new Human("����", 31);
		Human h5 = new Human("������", 36);
		
		Human[] arr = new Human[] {h1, h2, h3, h4, h5};
		ArrayList<Human> list = new ArrayList<Human>(Arrays.asList(arr));
		
		System.out.println(list);
		
//		�⺻ ���� ������ Ŭ������ Comparable �������̽��� �����ϵ��� �ؼ� ����� �� �� �ִ�.
//		�⺻ ���� ������ ���ų�, �⺻ ���İ� �ٸ��� ����ϰ� ������ Comparator�� ����� �� �ִ�.
//		Collections.sort(list, new Comparator<Human>() {
//			@Override
//			public int compare(Human o1, Human o2) {
//				int diff = o1.getAge() - o2.getAge();
////				System.out.println(o1.getAge() + ", " + o2.getAge() + " : " + diff);
//				return diff;
//			}
//		});
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.sort(list, new Comparator<Human>() {
			@Override
			public int compare(Human o1, Human o2) {
				int diff = o1.getName().charAt(0) - o2.getName().charAt(0);
//				System.out.println(o1.getAge() + ", " + o2.getAge() + " : " + diff);
				return diff;
			}
		});
		System.out.println(list);
		
		
	}
}
