package level01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSort {
	static public String solution(String s) {
		String answer = "";
		String[] strArr = s.split("");
		
		Arrays.sort(strArr);
		List<String> list = Arrays.asList(strArr);
		
		Collections.reverse(list);
		
		for(int i = 0; i < list.size(); i++) {
			answer += list.get(i);
		}
		
		System.out.println(answer);
		
		return answer;
	}
	
	public static void main(String[] args) {
		
	}
}
