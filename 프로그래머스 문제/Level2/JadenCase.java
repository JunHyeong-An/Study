package quiz;

import java.util.Arrays;

public class JadenCase {
	public static String solution(String s) {
		String answer = "";
		String[] tmp = s.split(" ");
		
		System.out.println(Arrays.toString(tmp));
		
		for(int i = 0; i < tmp.length; i++) {
			if(!tmp[i].equals(""))
				tmp[i] = tmp[i].substring(0, 1).toUpperCase() + tmp[i].substring(1, tmp[i].length()).toLowerCase();
			
			answer += (i != tmp.length - 1) ? tmp[i] + " " : tmp[i]; 
		}
		
		if(s.charAt(s.length() - 1) == ' ') answer += " ";
		
		return answer;
	}
	
	public static void main(String[] args) {
		String result = solution(" aa  a");
		System.out.println(result);
	}
}
