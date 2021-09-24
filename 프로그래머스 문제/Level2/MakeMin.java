package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MakeMin {
	public static int solution(int []A, int []B) {
		int answer = 0;
		
		List<Integer> aList = new ArrayList<Integer>();
		List<Integer> bList = new ArrayList<Integer>();
		
		Arrays.sort(A);
		
		for(int i : A) aList.add(i);
		for(int i : B) bList.add(i);
		
		Collections.sort(bList, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				if(o1 < o2) return 1;
				else if(o1 > o2) return -1;
				return 0;
			};
		});
		
		
		for(int i = 0; i < aList.size(); i++) {
			answer += aList.get(i) * bList.get(i);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		int result = solution(new int[] {1, 4, 2}, new int[] {5, 4, 4});		//29
		System.out.println(result);
	}
}
