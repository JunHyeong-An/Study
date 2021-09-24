package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	 public static int[] solution(int[] arr, int divisor) {
	        int[] answer = {};
	        
	        List<Integer> list = new ArrayList<Integer>();
	        
	        for(int i = 0; i < arr.length; i++) {
	        	if(arr[i] % divisor == 0)
	        		list.add(arr[i]);
	        }
	        
	        if(list.size() == 0) return new int[] {-1};
	        
	        Collections.sort(list);
	        
	        answer = new int[list.size()];
	        
	        for(int i = 0; i < answer.length; i++)
	        	answer[i] = list.get(i);
	        
	        return answer;
	    }

	    public static void main(String[] args) {
	        int [] arr = {5,2,6,10};
	        System.out.println(Arrays.toString(solution(arr, 5)));
	    }
}
