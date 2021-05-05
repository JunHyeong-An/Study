package level01;

public class FindPrimeNumbers {
	static public int solution(int n) {
        int answer = 0;
        
        for(int i = 2; i <= n; i++) {
        	int cnt = 0;
        	
        	for(int j = 1; j <= i; j++) {
        		if(i % j == 0) cnt++;
        	}
        	if(cnt == 2) answer++;
        }
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		solution(10);
		solution(5);
	}
}
