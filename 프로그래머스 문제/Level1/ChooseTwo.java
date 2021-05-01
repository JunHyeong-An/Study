package level01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ChooseTwo {
	static public int[] solution(int[] numbers) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				int num = numbers[i] + numbers[j];
				list.add(num);
			}
		}
        
		Set<Integer> s = new HashSet<Integer>(list);
		list = new ArrayList<Integer>(s);
		
		list.sort(null);
		System.out.println(list);
		int[] answer = new int[list.size()];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		
        return answer;
    }
	
	public static void main(String[] args) {
		solution(new int[] {0,100,1000,10});
	}
}
