package level01;

public class PhoneNumHide {
	public static String solution(String phone_number) {
		String answer = "";
		
		for(int i = 0; i < phone_number.length()-4; i++) {
			answer += "*";
		}
		
		String num = phone_number.substring(phone_number.length()-4);
		answer += num;
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("023424656"));
	}
}
