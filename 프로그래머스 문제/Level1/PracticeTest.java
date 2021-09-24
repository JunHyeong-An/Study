package level01;

public class PracticeTest {
	static public int[] solution(int[] answers) {
		int[] onePerson = new int[] {1, 2, 3, 4, 5};
		int[] twoPerson = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
		int[] threePerson = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		int oneIndex = 0;
		int twoIndex = 0;
		int threeIndex = 0;
		int oneCorrectAnswer = 0;
		int twoCorrectAnswer = 0;
		int threeCorrectAnswer = 0;
		
		
		for(int i = 0; i < answers.length; i++) {
			System.out.println("현재 정답 : " + answers[i]);
			if(oneIndex == onePerson.length) oneIndex = 0;
			System.out.println("oneIndex : " + oneIndex);
			if(answers[i] == onePerson[oneIndex]) {
				oneCorrectAnswer++;
				System.out.println("현재 1번이 찍은 번호 : " + onePerson[oneIndex]);
				System.out.println("1번 수포자가 맞춘 정답 : " + answers[i]);
				System.out.println();
			}
			oneIndex++;
			
			if(twoIndex == twoPerson.length) twoIndex = 0;
			System.out.println("twoIndex : " + twoIndex);

			if(answers[i] == twoPerson[twoIndex]) {
				System.out.println("현재 2번이 찍은 번호 : " + twoPerson[twoIndex]);
				System.out.println("2번 수포자가 맞춘 정답 : " + answers[threeIndex]);
				System.out.println();
				twoCorrectAnswer++;
				
			}
			twoIndex++;
			
			if(threeIndex == threePerson.length) threeIndex = 0;
			System.out.println("threeIndex : " + threeIndex);
			if(answers[i] == threePerson[threeIndex]) {
				System.out.println("현재 3번이 찍은 번호 : " + threePerson[i]);
				System.out.println("3번 수포자가 맞춘 정답 : " + answers[i]);
				System.out.println();
				threeCorrectAnswer++;
				
			}
			threeIndex++;
		}System.out.println();
		
		int max = oneCorrectAnswer;
		int cnt = 0;
		
		if(max < twoCorrectAnswer) max = twoCorrectAnswer;
		if(max < threeCorrectAnswer) max = threeCorrectAnswer;
        
		if(oneCorrectAnswer == max) cnt++;
		if(twoCorrectAnswer == max) cnt++;
		if(threeCorrectAnswer == max) cnt++;

		int[] answer = new int[cnt];
		int index = 0;
		
		if(oneCorrectAnswer == max) {
			answer[index] = 1; 
			index++;
		}
		if(twoCorrectAnswer == max) {
			answer[index] = 2;
			index++;
		}
		if(threeCorrectAnswer == max) {
			answer[index] = 3;
			index++;
		}
		System.out.println("oneCorrectAnswer : " + oneCorrectAnswer);
		System.out.println("twoCorrectAnswer : " + twoCorrectAnswer);
		System.out.println("threeCorrectAnswer : " + threeCorrectAnswer);
		
		for(int i = 0 ; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
        return answer;
    }
	
	public static void main(String[] args) {
		//solution(new int[] {1,2,3,4,5});
		solution(new int[] {1,1,3,3,4,2});
		//solution(new int[] {1,3,2,4,2});
		

	}
}
