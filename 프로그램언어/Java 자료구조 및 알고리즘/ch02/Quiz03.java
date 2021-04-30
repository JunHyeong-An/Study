package ch02;

import java.util.Random;

public class Quiz03 {
	public static void showArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
	}
	
	public static int sumOf(int[] arr) {
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Random rd = new Random();
		int num = 1 + rd.nextInt(9);
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(50);
		}
		showArr(arr);
		System.out.println(sumOf(arr));
	}
}
