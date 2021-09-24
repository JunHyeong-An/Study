package ch02;

import java.util.Scanner;

public class MaxOfArray {
	public static int MaxOf(int[] arr) {
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) { 
			if(arr[i] > max) max = arr[i];
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� �� : ");
		num = sc.nextInt();
		
		int[] heights = new int[num];
		
		for(int i = 0; i < heights.length; i++) {
			System.out.print((i + 1) + "��° ��� Ű : ");
			heights[i] = sc.nextInt(); 
		}
		
		System.out.println(MaxOf(heights));
		
		sc.close();
	}
}
