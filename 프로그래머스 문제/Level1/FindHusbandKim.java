package level01;

public class FindHusbandKim {
	public String solution(String[] seoul) {
        String answer = "";
        int kim = 0;
        
        for(int i = 0; i < seoul.length; i++ ) {
        	if(seoul[i].equals("Kim")) kim = i; 
        	
        }
        
        answer = String.format("김서방은 %d에 있다", kim);
        return answer;
    }
	
	public static void main(String[] args) {
		
	}
}
