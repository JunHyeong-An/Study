package level01;

import java.util.Arrays;
import java.util.List;

public class DivArr {
	static public int[] solution(int[] arr, int divisor) {
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) cnt++;
		}
		int[] answer = new int[cnt];
		
		if(cnt == 0) return new int[] {-1};
		
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				answer[index] = arr[i];
				index++;
			}
		}

		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		Arrays.sort(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		solution(new int[] {5, 9, 7, 10}, 5);
	}
}
