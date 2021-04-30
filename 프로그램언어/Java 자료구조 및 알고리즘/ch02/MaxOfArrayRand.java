package ch02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	public static int MaxOf(int[] arr) {
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) { 
			if(arr[i] > max) max = arr[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		int num;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		num = sc.nextInt();
		
		int[] heights = new int[num];
		
		for(int i = 0; i < heights.length; i++) {
			heights[i] = 150 + rand.nextInt(60);
			System.out.println((i+1) + "번째 인원 키 : " + heights[i]);
		}
		
		System.out.println(MaxOf(heights));
		
		sc.close();
	}
}
