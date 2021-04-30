package ch02;

import java.util.Random;

public class ReverseArray {
	public static void showArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] 번째 수 : " + arr[i]);
		}
	}
	
	public static void reverseArray(int[] arr) {
		for(int i = 0; i < arr.length / 2; i++) {
			int tmp = 0;
			
			tmp = arr[i];
			
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = tmp;
		}
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		int num = 5 + rand.nextInt(5);
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 1 + rand.nextInt(100);
		}
		showArr(arr);
		System.out.println("========역순========");
		reverseArray(arr);
		showArr(arr);
	}
}
