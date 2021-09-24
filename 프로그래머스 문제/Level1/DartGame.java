package level01;


public class DartGame {
	static int solution(String dartResult) {
		int answer = 0;
		int tmp = 0;
		int tmp1 = 0;
		int tmp2 = 0;
		int tmp3 = 0;
		int cnt = 1;

		boolean flag = dartResult.contains("S") ||
				dartResult.contains("D") ||
				dartResult.contains("T");

		if(flag) {
			dartResult = dartResult.replace("S", "1");
			dartResult = dartResult.replace("D", "2");
			dartResult = dartResult.replace("T", "3");
		}

		if(dartResult.length() != 9) {
			while(dartResult.length() != 9) {
				dartResult = dartResult + " ";
			}
		}


		for(int i = 0; i < dartResult.length() - 2; i++) {
			if(dartResult.charAt(i) >= '1' && dartResult.charAt(i) <= '9' ) {
				if(dartResult.charAt(i + 1) == '0') {
					int zeroIndex = dartResult.indexOf('0');

					tmp = i + 1 == zeroIndex ? (int)Math.pow((dartResult.charAt(i) - '0') * 10, dartResult.charAt(i + 2) - '0')
							: (int)Math.pow(dartResult.charAt(i) - '0', dartResult.charAt(i + 1) - '0');
					i++;
				}

				else tmp = (int)Math.pow(dartResult.charAt(i) - '0', dartResult.charAt(i + 1) - '0');

				if(cnt == 1) tmp1 = tmp;
				else if(cnt == 2) tmp2 = tmp;
				else tmp3 = tmp;
				//System.out.println("i : " + i);
				//System.out.printf("%s : %d, %s : %d, %s : %d\n", "tmp1", tmp1, "tmp2", tmp2, "tmp3", tmp3);
				i++;

				if(dartResult.charAt(i + 1) == '*') {
					if(cnt == 1) {
						answer += tmp1;
						answer *= 2;
						i++;
					}
					else if(cnt == 2) {
						answer += tmp2;
						answer *= 2;
						i++;
					}
					else {
						tmp2 *= 2;
						tmp3 *= 2;
						answer = answer + tmp2 + tmp3 - (tmp2 / 2);
						//System.out.println(cnt + "번째 " + "tmp2 : " + tmp2 + ", tmp3 : " + tmp3);
					}
				}

				else if(dartResult.charAt(i + 1) == '#') {
					tmp *= -1;
					answer += tmp;
					i++;
				}

				else answer += tmp;
				//System.out.printf("%d 번째 answer : %d\n\n", cnt, answer);
			}
			cnt++;
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("1S2D3T"));		//32
		System.out.println(solution("1S2D*3T"));	//37
		System.out.println(solution("1D2S#10S"));	//9	
		System.out.println(solution("1D2S0T"));		//3
		System.out.println(solution("1S*2T*3S"));	//23
		System.out.println(solution("1D#2S*3S"));	//5
		System.out.println(solution("1T2D3D#"));	//-4
		System.out.println(solution("1D2S3T*"));	//59




	}
}
