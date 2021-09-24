package ch10;

import java.util.Calendar;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		final int START_DAY_OF_WEEK;
		final int END_DAY;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 : ");
		final int year = sc.nextInt();
		
		System.out.print("월 : ");
		final int month = sc.nextInt();
		
		Calendar startDate = Calendar.getInstance();
		Calendar endDate = Calendar.getInstance();
		
		startDate.set(year, month-1, 1);
		endDate.set(year, month, 1);
		endDate.add(Calendar.DAY_OF_MONTH, -1);
		
		START_DAY_OF_WEEK = startDate.get(Calendar.DAY_OF_WEEK);
		END_DAY = endDate.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("       " + year + "년 " + (month) + "월");
		
		System.out.println("일    월    화    수    목    금    토");
		
		for(int i = 0; i < START_DAY_OF_WEEK; i++) {
			System.out.print("   ");
		}
		
		for(int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			System.out.printf("%3d", i);
			if(n % 7 == 0)
				System.out.println();
		}
		
		sc.close();
	}
}
