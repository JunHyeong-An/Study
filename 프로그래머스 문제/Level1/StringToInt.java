package level01;

public class StringToInt {
	static public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		solution("1234");
		solution("-1234");
		
	}
}
