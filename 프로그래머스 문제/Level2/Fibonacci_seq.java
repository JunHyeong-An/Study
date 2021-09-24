package quiz;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci_seq {
	public static List<Long> makeFibonacci() {
		List<Long> list = new ArrayList<Long>();
		long n = 0;

		list.add(0L);list.add(1L);

		for(int i = 0; i < 100000; i++) {
			n = list.get(i) + list.get(i + 1);
			list.add(n);
		}
		return list;
	}

	public static long solution(int n) {
		long answer = 0;

		List<Long> list = makeFibonacci();
		
		answer = (list.get(n-2) % 1234567 + list.get(n-1) % 1234567) % 1234567;
		
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution(100000));
	}
}
