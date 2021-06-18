package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex10 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size() < 6) {
			Random ran = new Random();
			set.add(ran.nextInt(45));
		}
		
		List<Integer> list = new LinkedList<Integer>(set);
		
		Collections.sort(list);
		System.out.println(list);
	}
}
