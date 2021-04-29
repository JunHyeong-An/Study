package level01;

public class Years {
	static public String solution(int a, int b) {
		String answer = "";
		String[] weekDays = new String[] {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

		int day = 0;

		for(int i = 1; i < a; i++) {

			boolean flag1 = i == 1 || i == 3 || i == 5 || i == 7 ||
					i == 8 || i == 10 || i == 12;
			boolean flag2 = i == 4 || i == 6 || i == 9 || i == 11;
			boolean flag3 = i == 2;

			if(flag1) {
				for(int j = 0; j < 31; j++) {
					day++;
				}
			}

			else if(flag2) {
				for(int j = 0; j < 30; j++) {
					day++;
				}
			}
			else if(flag3) {
				for(int j = 0; j < 29; j++) {
					day++;
				}
			}
		}
		day += b;

		answer = weekDays[day % 7];
		System.out.println("day : " + day);
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		solution(1, 1);
		solution(5, 24);
	}
}
