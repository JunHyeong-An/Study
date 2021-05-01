package level01;

public class CenterChar {
	 public String solution(String s) {
	        String answer = "";
	        
	        if(s.length() % 2 ==0) {
	        	int center = s.length() / 2;
	        	
	        	answer += s.charAt(center - 1);
	        	answer += s.charAt(center);
	        }
	        else {
	        	int center = s.length() / 2;
	        	
	        	answer += s.charAt(center);
	        }
	   
	        return answer;
	    }
}
