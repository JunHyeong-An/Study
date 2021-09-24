package level01;

public class SecretMap {
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		String[] convertBinarys1 = new String[n];
		String[] convertBinarys2 = new String[n];
		int[] tmp1 = new int[n];
		int[] tmp2 = new int[n];
		int[] tmp3 = new int[n];

		for(int i = 0; i < n; i++) {
			convertBinarys1[i] = Integer.toBinaryString(arr1[i]);
			convertBinarys2[i] = Integer.toBinaryString(arr2[i]);
			System.out.println("convertBinarys1 : " + convertBinarys1[i]);
			System.out.println("convertBinarys2 : " + convertBinarys2[i]);
		}

		for(int i = 0; i < n; i++) {
			tmp1[i] = Integer.parseInt(convertBinarys1[i]);
			tmp2[i] = Integer.parseInt(convertBinarys2[i]);
			tmp3[i] = tmp1[i] + tmp2[i];
			answer[i] = String.format("%d", tmp3[i]);

			
			if(answer[i].length() < n) {
				answer[i] = "0" + answer[i];
			}
			
			answer[i] = answer[i].replace("1", "#");
			answer[i] = answer[i].replace("2", "#");
			answer[i] = answer[i].replace("0", " ");
		}
		return answer;
	}

	public static void main(String[] args) {
		//int[] arr1 = {9, 20, 28, 18, 11};
		//int[] arr2 = {30, 1, 21, 17, 28};

		// String[] result = solution(5, arr1, arr2);
		String[] result2 = solution(6, new int[] {46, 33, 33 ,22, 31, 50}, 
				new int[] {27 ,56, 19, 14, 14, 10});
		
		for(int i = 0; i < 6; i++) {
			System.out.print("\"" + result2[i] + "\"" + ", ");
		}

	}
}
