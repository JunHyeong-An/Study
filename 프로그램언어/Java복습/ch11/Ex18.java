package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex18 {
	public static String printBar(int cnt) {
		String bar = "";
		
		for(int i = 0; i < cnt; i++) 
			bar += "#";
		return bar;
	}
	
	public static void main(String[] args) {
		String[] data = {"A", "A", "A", "B", "D", "C", "D", "B", "C", "D", "B", "B", "A" };
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String key : data) {
			if(map.containsKey(key)) {
				int value = map.get(key) + 1;
				map.put(key, value);
			}
			else {
				map.put(key, 1);
			}
		}
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : " + printBar(map.get(key)) + " " + map.get(key));
		}
	}
}
