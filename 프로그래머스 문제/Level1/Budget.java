package level01;

import java.util.Arrays;

public class Budget {
	public static int solution(int[] d, int budget) {
		int answer = 0;
		int sum = 0, cnt = 0;
		
		Arrays.sort(d);
		
		for(int i = 0; i < d.length; i++) {
			sum += d[i];
			cnt++;
			
			if(sum > budget) {
				sum -= d[i];
				cnt--;
				break;
			}
		}
		
//		System.out.println("sum : " + sum);
//		System.out.println("cnt : " + cnt);
		
		answer = cnt;
		return answer;
	}

	public static void main(String[] args) {
		
		solution(new int[] {1,3,2,5,4}, 9);
		solution(new int[] {2,2,3,3}, 10);
	}
}
