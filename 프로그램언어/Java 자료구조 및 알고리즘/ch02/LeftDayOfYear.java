package ch02;

public class LeftDayOfYear {
	public static void show(int y, int m, int d) {
		int[][] days = {{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
						{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
		
		boolean flag = y % 4 == 0 && y % 100 != 0|| y % 400 == 0;
		
		int yindex = (flag) ? 1 : 0;
		int totalYearOfDay = 0;
		int DayOfYear = d;
		
		for(int i = 0; i < 12; i++) {
			totalYearOfDay += days[yindex][i];
		}
		
		for(int i = 0; i < m - 1; i++) {
			DayOfYear += days[yindex][i];
		}
		
		System.out.println(totalYearOfDay - DayOfYear);
	}
	
	public static void main(String[] args) {
		show(2019, 3, 15);
	}
}
