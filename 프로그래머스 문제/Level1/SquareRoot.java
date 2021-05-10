package level01;

public class SquareRoot {
	static public long solution(long n) {
		long answer = 0;
		
		long x = (long)Math.sqrt(n);
		if(n == (long)Math.pow(x, 2)) {
			x += 1;
			answer = (long)Math.pow(x, 2);
			
			return answer;
		}
		else return -1;

		
	}
	
	
	public static void main(String[] args) {
		System.out.println(solution(121));
		System.out.println(solution(7));
		System.out.println(solution(30000000000000L));
	}
}
