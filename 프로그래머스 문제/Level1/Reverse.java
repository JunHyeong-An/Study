package level01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {
	static public int[] solution(long n) {
		String tmp = String.format("%d", n);
		String[] arr = tmp.split("");
		int[] answer = new int[arr.length];
		
		List<String> list = Arrays.asList(arr);
		Collections.reverse(list);
		
		for(int i = 0; i < list.size(); i++) {
			answer[i] = Integer.parseInt(list.get(i));
			System.out.println(answer[i]);
		}
        return answer;
    }
	
	public static void main(String[] args) {
		solution(12345);
	}
}
