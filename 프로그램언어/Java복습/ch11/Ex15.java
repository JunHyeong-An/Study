package ch11;

import java.util.TreeSet;

public class Ex15 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		int[] arr = {80, 95, 50,  35, 45, 65, 10, 100};
		
		for(int i : arr) {
			set.add(i);
		}
		System.out.println(set);
		
		System.out.println("50보다 큰수 : " + set.tailSet(50));
		System.out.println("50보다 작은 수 : " + set.headSet(50));
	}
}
