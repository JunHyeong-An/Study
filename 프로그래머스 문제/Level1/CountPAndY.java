package level01;

public class CountPAndY {
	boolean solution(String s) {
		boolean answer = true;
		int pCnt = 0;
		int yCnt = 0;
		
		s = s.toUpperCase();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'P') pCnt++;
			else if(s.charAt(i) == 'Y') yCnt++;
		}
		
		if(!(pCnt == yCnt)) answer = false;
		
		return answer;
	}
	
	public static void main(String[] args) {
		
	}
}
