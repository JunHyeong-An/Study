package level01;

import java.util.Arrays;

public class SortStringMyMind {
	static public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        for(int i = 0; i < strings.length; i++) {
        	for(int j = i + 1; j < strings.length; j++) {
        		
        		if(strings[i].charAt(n) > strings[j].charAt(n)) {
        			String tmp = strings[i];
        			strings[i] = strings[j];
        			strings[j] = tmp;
        		}
        		else if(strings[i].charAt(n) == strings[j].charAt(n)) {
        			String[] tmp = new String[] {strings[i], strings[j]};
        			Arrays.sort(tmp);
        			strings[i] = tmp[0];
        			strings[j] = tmp[1];
        		}
        	}
        }
        answer = strings;
        return answer;
    }
	
	public static void main(String[] args) {
		//solution(new String[] {"sun", "bed", "car"}, 1);
		solution(new String[] {"abce", "abcd", "cdx"}, 2);
	}
}
