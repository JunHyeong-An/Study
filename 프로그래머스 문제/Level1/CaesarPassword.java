package level01;

public class CaesarPassword {
	static public String solution(String s, int n) {
		String answer = "";

		for(int i = 0; i < s.length(); i++) {
			char tmp = ' ';
			boolean flag1 = s.charAt(i) >= 'a' && s.charAt(i) <= 'z';
			boolean flag2 = s.charAt(i) >= 'A' && s.charAt(i) <= 'Z';


			if(s.charAt(i) != tmp) {
				tmp = (char) (s.charAt(i) + n);
				System.out.println("tmp : " + tmp);
				
				if(flag1 && tmp > 'z') {
					int tmp2 =  (int)tmp - (int)'z' - 1;
					tmp = (char)('a' + tmp2);
				}
				else if(flag2 && tmp > 'Z') {
					int tmp2 =  (int)tmp - (int)'Z' - 1;
					
					tmp = (char)('A' + tmp2);
				}

				answer += tmp;
			}
			else answer += tmp;
		}
		return answer;
	}

	public static void main(String[] args) {
		solution("Zz", 1);
		solution("z", 1);
		solution("a B z", 4);
	}
}
