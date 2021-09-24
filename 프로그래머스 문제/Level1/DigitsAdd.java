package level01;

public class DigitsAdd {
	static public int solution(int n) {
		int answer = 0;
		
		while(!(n < 10)) {
			answer += n  % 10;
			n /= 10;
		}
		answer += n;
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		solution(123);
		solution(987);
	}
}
