package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Ex19 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		System.out.println(list);
		
		Collections.addAll(list, 1, 2, 3, 4, 5);
		System.out.println(list);
		
		Collections.rotate(list, 2);
		System.out.println(list);
		
		Collections.swap(list, 0, 2);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		int idx = Collections.binarySearch(list, 3);
		System.out.println("index of 3 : " + idx);
		
		System.out.println("max : " + Collections.max(list));
		System.out.println("min : " + Collections.min(list));
		System.out.println("min : " + Collections.max(list, Collections.reverseOrder()));
		
		Collections.fill(list, 9);
		System.out.println("list = " + list);
		
		List<Integer> newList = Collections.nCopies(list.size(), 2);
		System.out.println("newList : " + newList);
		System.out.println(Collections.disjoint(list, newList));		// 공통 요소가 없으면 true
		
		Collections.copy(list, newList);		// 뒤에 있는게 src
		System.out.println("newList : " + newList);
		System.out.println("list : " + list);
		
		Collections.replaceAll(list, 2, 1);
		System.out.println("list : " + list);
		
		
		Enumeration<Integer> e = Collections.enumeration(list);
		
		ArrayList<Integer> list2 = Collections.list(e);
		
		System.out.println("list2 = " + list2);
	}
}
