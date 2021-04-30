package ch02;

public class CloneArray {
	public static void showArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}System.out.println();
	}
	
	public static void showMaxOfArr(int[] arr) {
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) max = arr[i];
		}
		
		System.out.println("최대값은 " + max + "입니다.");
	}
	
	public static void main(String[] args) {
		int[] a = {1,1,3,2,4};
		int[] b = a.clone();
		
		showArr(a);
		showArr(b);
		
		showMaxOfArr(a);
	}
}
