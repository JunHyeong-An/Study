package ch02;

public class DayOfYear2 {
	public static void show(int y, int m, int d) {
		int[][] days = {{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
						{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
		
		int yIndex = y % 4 == 0 && y % 100 != 0 || y % 400 ==0 ? 1 : 0;
		
		int result = d;
		int index = 0;
		while(index < m-1) {
			result += days[yIndex][index++];
		}
		
		
//		for(int i = 0; i < m - 1; i++) {
//			result += days[yIndex][i];
//		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		show(2020, 1, 1);
	}
}
