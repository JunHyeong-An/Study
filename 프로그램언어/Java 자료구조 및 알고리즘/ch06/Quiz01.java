package ch06;

import java.util.Arrays;

public class Quiz01 {
	static void swap(int[] arr, int i1, int i2) {
		int tmp = arr[i2];
		arr[i2] = arr[i1];
		arr[i1] = tmp;
	}
	
	static int[] bubbleSortDesc(int[] arr) {
		int pass = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					pass++;
					swap(arr, i, j);
				}
			}
		}
		System.out.println("pass : " + pass);
		
		return arr;
	}
	
	static int[] bubbleSortAsc(int[] arr) {
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
		
		System.out.println(Arrays.toString(bubbleSortDesc(arr)));
		System.out.println("--------------------------");
		System.out.println(Arrays.toString(bubbleSortAsc(arr)));
	}
}
