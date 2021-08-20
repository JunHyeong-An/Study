package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxAndMin {
	public static String solution(String s) {
		String answer = "";
		String[] strs = s.split(" ");
		List<Integer> list = new ArrayList<Integer>();
		
		for(String str : strs) list.add(Integer.valueOf(str));
		
		Collections.sort(list);
		
		answer += (String.valueOf(list.get(0)) + " " + String.valueOf(list.get(list.size()-1)));
		
		return answer;
	}
	
	public static void main(String[] args) {
		String result = solution("-1 -2 -4 -3");
		System.out.println(result);
	}
}
