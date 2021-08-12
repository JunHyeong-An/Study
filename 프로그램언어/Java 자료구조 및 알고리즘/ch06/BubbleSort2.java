package ch06;

import java.util.Arrays;

public class BubbleSort2 {
	static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	static int[] bubbleSort(int[] arr) {
		int pass = 0;

		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					pass++;
					swap(arr, i, j);
				}
			}
		}
		System.out.println("pass : " + pass);
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {
				1, 3, 5, 6, 3, 8, 3, 9, 1, 2, 10	
		};

		System.out.println(Arrays.toString(bubbleSort(arr)));
	}
}
