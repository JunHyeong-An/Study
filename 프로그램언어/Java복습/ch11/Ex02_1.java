package ch11;

import java.util.LinkedList;

public class Ex02_1 {
	public static void main(String[] args) {
		LinkedList<Integer> lkList = new LinkedList<Integer>();
		
		lkList.add(1);
		lkList.add(2);
		lkList.add(3);
		lkList.add(4);
		lkList.add(5);
		
		System.out.println(lkList);
		System.out.println(lkList.get(4));
	}
}
