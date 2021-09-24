package level01;
   
public class SecretMap2 {
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		for(int i = 0; i < n; i++) {
			answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
			
			for(int j = 0; j < n; j++) {
				if(answer[i].length() < n) {
					answer[i] = "0" + answer[i];
				}
			}
			
			answer[i] = answer[i].replace("1", "#");
			answer[i] = answer[i].replace("0", " ");
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		//int[] arr1 = {9, 20, 28, 18, 11};
		//int[] arr2 = {30, 1, 21, 17, 28};

		// String[] result = solution(5, arr1, arr2);
		String[] result2 = solution(5, new int[] {0, 0, 0, 0, 0}, 
				new int[] {30, 1, 21, 17, 28});
		
		for(int i = 0; i < 5; i++) {
			System.out.print("\"" + result2[i] + "\"" + ", ");
		}
	}
}
