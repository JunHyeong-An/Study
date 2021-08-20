package quiz;

public class ExpressionOfNumber {
	public static int solution(int n) {
		int answer = 1;
		int limit = n / 2 == 2 ? n / 2 : n / 2 + 1;
		System.out.println(limit);
		
		for(int i = 1; i <= limit; i++) {
			int sum = 0;
			for(int j = i; j <= limit; j++) {
				sum += j;
				System.out.println("j : " + j);
				System.out.println("sum : " + sum);
				if(sum > n) break;
				
				if(sum == n) {
					answer++;
					break;
				}
			}
			System.out.println();
		}
		
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		solution(15);
	}
}
