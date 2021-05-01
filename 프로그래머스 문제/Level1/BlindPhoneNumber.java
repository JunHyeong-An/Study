package level01;

public class BlindPhoneNumber {
	public static String solution(String phone_number) {
        String answer = "";
        String tmp = "";
        
        int blindPoint = phone_number.length() - 4;
        for(int i = 0; i < blindPoint; i++) {
        	tmp += "*";
        }
        phone_number = phone_number.substring(phone_number.length() - 4, phone_number.length());
        tmp += phone_number;
        
        answer = tmp;
        
        return answer;
    }
	
	public static void main(String[] args) {
		solution("01033334444");
		solution("027778888");
	}
}
