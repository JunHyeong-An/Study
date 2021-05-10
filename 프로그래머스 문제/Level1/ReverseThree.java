package level01;

public class ReverseThree {
	static public int solution(int n) {
		int answer = 0;
		String str = "";
		int tmp = 0;
		
		while(true) {
			str += String.format("%d", n % 3);
			n /= 3;
			
			if(n == 0) break;
		}
		
		tmp = Integer.parseInt(str);
		int cnt = 1;
		
		while(true) {
			answer += (tmp % 10) * cnt;
			tmp /= 10;
			cnt *= 3;
			if(tmp == 0) break;
		}
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		
	}
}
