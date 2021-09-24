package level01;

public class GuessTheColatz {
	public static int solution(long num) {
        int answer = 0;
        
        if(num == 1) return 0;
        while(true) {
        	num = num % 2 == 0 ? num / 2 : num * 3 + 1;
        	answer++;
        	
        	if(answer == 500) return -1;
        	if(num == 1) break;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(solution(6));
		System.out.println(solution(16));
		System.out.println(solution(626331));
	}
}
