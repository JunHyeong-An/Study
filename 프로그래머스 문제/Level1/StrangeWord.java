package level01;

public class StrangeWord {
	static public String solution(String s) {
		String answer = "";
		int cnt = 0;

		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				cnt++;
			}
		}

		String[] strArr = new String[cnt];

		strArr = s.split(" ", -1);

		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length(); j++) {
				if(j % 2 == 0) {
					answer += Character.toUpperCase(strArr[i].charAt(j));
				}
				else {
					answer += Character.toLowerCase(strArr[i].charAt(j));
				}
				
			}
			if(i != strArr.length - 1) answer += " ";
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("try hello world").equals("TrY HeLlO WoRlD"));
		System.out.println(solution("Hello World ").equals("HeLlO WoRlD"));
		System.out.println(solution("Hello").equals("HeLlO"));

//		char ch = 'A';
//		System.out.println((char)(ch + 32));

	}
}
