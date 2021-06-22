package level01;

import java.util.Arrays;

public class RemoveSmallestNumber {
	static public int[] solution(int[] arr) {
		if(arr.length == 1) return new int[] {-1};
		
		int min;
		
		int[] tmpArr = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			tmpArr[i] = arr[i];
		}
		Arrays.sort(tmpArr);
		
		min = tmpArr[0];
		int cnt = 0;
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(min == arr[i]) cnt++;
		}
		int[] answer = new int[arr.length - cnt];
		
		for(int i = 0; i < arr.length; i++) {
			if(min != arr[i]) {
				answer[index] = arr[i];
				index++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] arr1 = solution(new int[] {5, 1, 2, 6, 8});	// 4,3,2
		int[] arr2 = solution(new int[] {10});		// -1

		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
