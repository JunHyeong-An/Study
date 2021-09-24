package ch02;

public class ArrayEqual {
	public static boolean equals(int[] a, int[] b) {
		boolean result = false;
		
		if(a.length != b.length) result = false;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] == b[i]) result = true;
			else {
				result = false;
				return result;
			}
		}
		
		return result;
	}
	  
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arr2 = {1,2,6,4,5};
		
		System.out.println(equals(arr, arr2));
	}
}
