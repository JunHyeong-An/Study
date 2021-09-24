package ch11;

import java.util.TreeSet;

public class Ex13 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		
		String from = "b";
		String to = "d";
		
		set.add("abc"); set.add("allien"); set.add("bat"); set.add("car");
		set.add("Car"); set.add("disc"); set.add("dance"); set.add("dZZZZ");
		set.add("dzzzz"); set.add("elephant"); set.add("elevator"); set.add("fan");
		set.add("flower"); set.add("d");
		
		System.out.println(set);
		
		System.out.println("range search : from : " + from + ", to : " + to);
		System.out.println(set.subSet(from, to));
		System.out.println(set.subSet(from, to + "zzzzz"));
	}
}
