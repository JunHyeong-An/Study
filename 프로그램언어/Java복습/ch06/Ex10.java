package ch06;

class MyMath3 {
	int add(int a, int b) {return a + b;}
	long add(int a, long b) {return a + b;}
	long add(long a, int b) {return a + b;}
	long add(long a, long b) {return a + b;}
	int add(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
 
public class Ex10 {
	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		
		System.out.println(mm.add(1, 2));
		System.out.println(mm.add(1L, 2));
		System.out.println(mm.add(5, 10L));
		System.out.println(mm.add(new int[] {1, 2, 3, 56, 7, 10}));
	}
}
