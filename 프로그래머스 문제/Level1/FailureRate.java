  package level01;

public class FailureRate {
	// 현재 스테이지에 도달한 사람
	// 현재 스테이지에 도달했지만 아직 클리어 하지 못한사람
	
	static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		int currStagePerson = 0;
		int canNotClearPerson = 0;
		double failureRate = 0;
		double[] failureRates = new double[N];
		
		for(int i = 0; i < N; i++) {
			answer[i] = i + 1;
		}
		
		for(int i = 0; i < N; i++) {
			currStagePerson = 0;
			canNotClearPerson = 0;
			for(int j = 0; j < stages.length; j++) {
				if(stages[j] >= i + 1) currStagePerson++;
				if(stages[j] == i + 1) canNotClearPerson++;
				if(stages[j] == N + 1 && i == N - 1) {
				}
			}
			failureRate = (double)canNotClearPerson / (double)currStagePerson * 100.0;
			failureRates[i] = failureRate;
			
			
//			System.out.println(i+1 + "번째 스테이지 " + "currStagePerson : " + currStagePerson);
//			System.out.println(i+1 + "번째 스테이지 " + "canNotClearPerson : " + canNotClearPerson);
//			System.out.println(i+1 + "번째 스테이지 " + "allClearPerson : " + allClearPerson);
//			System.out.println(i+1 + "번째 스테이지 " + "failureRate : " + failureRate);
//			System.out.println();
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(failureRates[i] > failureRates[j]) {
					double tmp = failureRates[i];
					int tmp2 = answer[i];
					
					failureRates[i] = failureRates[j];
					answer[i] = answer[j];
					
					failureRates[j] = tmp;
					answer[j] = tmp2;
				}
				else if(failureRates[i] == failureRates[j]) {
					if(answer[i] < answer[j]) {
						int tmp = answer[i];
						answer[i] = answer[j];
						answer[j] = tmp;
					}
				}
			}
		}
//		System.out.print("failureRates : ");
//		for(int i = 0; i < N; i++) {
//			System.out.print(failureRates[i] + ", ");
//		}
		
        return answer;
	}
	
	public static void main(String[] args) {
		int[] stage = new int[] {2, 1, 2, 6, 2, 4, 3, 3};
		int[] stage2 = new int[] {4,4,4,4,4};
		int[] answer = solution(5, stage); // 3,4,2,1,5-

		int[] answer2 = solution(4, stage2); // 4 1 2 3
		
		System.out.print("\nanswer : ");
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + ", ");
		}
		System.out.print("\nanswer2 : ");
		for(int i = 0; i < answer2.length; i++) {
			System.out.print(answer2[i] + ", ");
		}
	}
}






