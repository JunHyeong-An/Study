package ch11;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex12 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		
		while(set.size() < 6) {
			Random ran = new Random();
			
			set.add(ran.nextInt(45));
		}
		System.out.println(set);
	}
}
