package ch02;

public class DayOfYear {
	public static void show(int year, int month, int day) {
		int[][] days = {{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
						{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
		
		boolean flag = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		int yIdx = (flag) ? 1 : 0;
		
		int result = day;
		
		for(int i = 0; i < month - 1; i++) {
			result += days[yIdx][i];
		}
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		show(2019, 3, 15);
	}
}
