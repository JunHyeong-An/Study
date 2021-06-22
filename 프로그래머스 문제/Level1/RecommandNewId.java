package level01;

public class RecommandNewId {
	static public String solution(String new_id) {
		String answer = "";

		new_id = new_id.toLowerCase();

		String str = "abcdefghijklmnopqrstuvwxyz-_.0123456789";

		for(int i = 0; i < new_id.length(); i++) {
			if(!str.contains(String.format("%c", new_id.charAt(i)))) {
				new_id = new_id.replace(String.format("%c", new_id.charAt(i)), "");
				i--;
			}
		}

		while(new_id.contains("..")) {
			new_id = new_id.replace("..", ".");
		}
		if(new_id.charAt(0) == '.') {
			new_id = new_id.substring(1);
		}
		if(new_id.length() > 0) {
			if(new_id.charAt(new_id.length()-1) == '.') {
				new_id = new_id.substring(0, new_id.length()-1);
			}
		}
		
		if(new_id.equals("")) new_id += "a";

		if(new_id.length() >= 16) new_id = new_id.substring(0, 15);

		if(new_id.length() > 0) {
			if(new_id.charAt(new_id.length()-1) == '.') {
				new_id = new_id.substring(0, new_id.length()-1);
			}			
		}
		

		while(new_id.length() <= 2) {
			new_id += new_id.charAt(new_id.length()-1);
		}

		answer = new_id;
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("...!@BaT#*..y.abcdefghijklm.").equals("bat.y.abcdefghi"));
		System.out.println(solution("z-+.^.").equals("z--"));
		System.out.println(solution("=.=").equals("aaa"));
		System.out.println(solution("123_.def").equals("123_.def"));
		System.out.println(solution("abcdefghijklmn.p").equals("abcdefghijklmn"));
	}
}
