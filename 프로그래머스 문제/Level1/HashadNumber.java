package level01;

public class HashadNumber {
	public static boolean solution(int x) {
		boolean answer = true;
		String num = String.format("%d", x);
		String[] tmp = new String[num.length() - 1];
		int sum = 0;
		
		tmp = num.split("");
		
		for(int i = 0; i < tmp.length; i++) {
			sum += Integer.parseInt(tmp[i]);
		}
		if(x % sum == 0) answer = true;
		else answer = false;
			
		return answer;
	}

	public static void main(String[] args) {
		solution(10);
		solution(12);
		solution(11);
		solution(13);
	}
}
