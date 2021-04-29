package ch01;

class Max4 {
	public static int MaxOfFour(int a, int b, int c, int d) {
		int max = a;
		
		if(max < b) max = b;
		if(max < c) max = c;
		if(max < d) max = d;
		
		return max;
	}
}

public class Quiz01 {
	public static void main(String[] args) {
	// 네 값의 최댓값을 구하는 max4 메서드를 작성
		System.out.println(Max4.MaxOfFour(1, 2, 3, 4));
		System.out.println(Max4.MaxOfFour(2, 1, 3, 4));
		System.out.println(Max4.MaxOfFour(1, 2, 4, 3));
		System.out.println(Max4.MaxOfFour(2, 1, 4, 3));
		System.out.println(Max4.MaxOfFour(4, 2, 3, 1));
		System.out.println(Max4.MaxOfFour(1, 3, 2, 4));
		System.out.println(Max4.MaxOfFour(4, 3, 2, 1));
		System.out.println(Max4.MaxOfFour(100, 34, 54, 12));
		System.out.println(Max4.MaxOfFour(134, 137, 144, 132));
		System.out.println(Max4.MaxOfFour(120, 134, 154, 124));
	}
}
