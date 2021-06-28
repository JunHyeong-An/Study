package level01;


public class HateSameNumber {
	static public int[] solution(int []arr) {
		int cnt = 1, prevNum = arr[0];
		
		
		for(int i = 0; i < arr.length; i++) {
//			System.out.println("arr[i] : " + arr[i]);
//			System.out.println("prevNum : " + prevNum);
			if(prevNum != arr[i]) {
				cnt++;
//				System.out.println("cnt : " + cnt);
			}
			
//			System.out.println();
			prevNum = arr[i];
		}
		
		int[] answer = new int[cnt];
		
		answer[0] = arr[0];
		prevNum = arr[0];
		int index = 1;
		for(int i = 1; i < arr.length; i++) {
			if(prevNum != arr[i]) {
				answer[index] = arr[i];
				index++;
			}
			prevNum = arr[i];
		}
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
			
		}
		
		return answer;
	}

	public static void main(String[] args) {
		//solution(new int[] {1,1,3,3,0,1,1});
		solution(new int[] {4,4,4,3,3});
	}
}
