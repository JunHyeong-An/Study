package ch06;

import java.util.Arrays;

public class BubbleSort {
	static void swap(int[] arr, int idx1, int idx2) {
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}
	
	static int[] bubbleSort(int[] arr) {
		for(int i = arr.length - 1; i >= 0; i--) {
			for(int j = i - 1; j >= 0; j--) 
				if(arr[i] < arr[j]) swap(arr, i, j);
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = bubbleSort(new int[] {2,5,4,7,1,3,9});
		
		System.out.println(Arrays.toString(arr));
	}
}
