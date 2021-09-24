package level01;

public class HandleString {
	static public boolean solution(String s) {
		boolean answer = true;
		
		if(s.length() == 4 || s.length() == 6) {
			answer = true;
		}
		else {
			answer = false;
			return answer;
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				answer = true;
			}
			else {
				answer = false;
				return answer;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("1234"));
	}
}
