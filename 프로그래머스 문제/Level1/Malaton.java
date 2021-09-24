package level01;

public class Malaton {
	static public String solution(String[] participant, String[] completion) {
		String answer = "";
		
		for(int i = 0; i < participant.length; i++) {
			for(int j = 0; j < completion.length; j++) {
				if(participant[i].equals(completion[j])) {
					participant[i] = "0";
					completion[j] = "0";
				}
			}
			if(!participant[i].equals("0")) {
				answer = participant[i];
			}
		}
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"});

		solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"});
	}
}
