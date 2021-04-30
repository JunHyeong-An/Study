package ch02;

import java.util.Random;

public class Quiz02 {
	public static void showArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
	}
	
	public static void reverse(int[] arr) {
		System.out.print("원래 배열 : ");
		showArr(arr);
		for(int i = 0; i < arr.length / 2; i++) {
			int tmp;
			System.out.println("arr["+ i + "]와 arr[" + (arr.length-1-i) + "] 번째를 교환합니다.");
			tmp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = tmp;
			showArr(arr);
		}
	}
	
	public static void main(String[] args) {
		Random rd = new Random();
		
		int num = 3 + rd.nextInt(7);
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(50);
		}
		
		reverse(arr);
	}
}
