package level01;

public class NumbersSpaced {
	public static long[] solution(long x, int n) {
		long[] answer = new long[n];
		long num = x;
		
		for(int i = 0; i < n; i++) {
			answer[i] = x;
			x += num;
			System.out.print(answer[i] + ", ");
		}
		System.out.println();
		return answer;
	}

	public static void main(String[] args) {
		//long[] lg1 = solution(0, 10);
		//long[] lg2 = solution(4, 3);
	}
}
