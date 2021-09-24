package level2;

public class NextBIgNumber {
	public static int getOneCount(String binary) {
		int cnt = 0;
		
		for(int i = 0; i < binary.length(); i++)
			if(binary.charAt(i) =='1') cnt++;
		
		return cnt;
	}
	
	public static int solution(int n) {
		int answer = 0;
		String firstNumberBin = Integer.toBinaryString(n);
		int firstNumOneCnt = getOneCount(firstNumberBin);
		
		while(true) {
			String tmp = Integer.toBinaryString(++n);
			int tmpOneCnt = getOneCount(tmp);
			
			if(firstNumOneCnt == tmpOneCnt) {
				answer = Integer.parseInt(tmp, 2);
				break;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int result = solution(78);		// 83
		System.out.println(result);
	}
}
