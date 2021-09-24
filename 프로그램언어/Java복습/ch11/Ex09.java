package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex09 {
	public static void main(String[] args) {
		Object[] objArr = {
				"1", new Integer(1), "2" ,"2", "3", "3", "4", "4", "4"
			};
		Set<Object> set = new HashSet<Object>();
		
		for(Object obj : objArr) {
			set.add(obj);
		}
		
		System.out.println(set);
		
		Iterator<Object> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
