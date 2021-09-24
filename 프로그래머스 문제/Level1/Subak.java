package level01;

public class Subak {
	static public String solution(int n) {
        String answer = "";
        
        for(int i = 0; i < n; i++) {
        	if(i % 2 == 0) answer += "수";
        	else answer += "박";
        }
        return answer;
    }
	
	public static void main(String[] args) {
		solution(3);
	}
}
