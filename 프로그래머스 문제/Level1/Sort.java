package level01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
	static public long solution(long n) {
        long answer = 0;
        
        String str = String.format("%d", n);
        
        String[] arr = str.split("");
        
        List<String> list = Arrays.asList(arr);
        list.sort(null);
        Collections.reverse(list);
        
        String tmp = "";
        for(int i = 0; i < list.size(); i++) {
        	 tmp += list.get(i);
        }
        answer = Long.parseLong(tmp);
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(8000000000L));
	}
}
