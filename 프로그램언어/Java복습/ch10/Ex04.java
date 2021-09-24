package ch10;

import java.util.Calendar;

public class Ex04 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		System.out.println(toString(date));
		
		date.set(2021, 5, 20);
		
		System.out.println(toString(date));
		System.out.println();
		
		System.out.println("== 1일 후 ==");
		date.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(toString(date));
		System.out.println();
		
		System.out.println("== 6달 후 ==");
		date.add(Calendar.MONTH, 6);
		System.out.println(toString(date));
		System.out.println();
		
		System.out.println("== 1년 후 ==");
		date.add(Calendar.YEAR, 1);
		System.out.println(toString(date));
		System.out.println();
	}
	static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + date.get(Calendar.MONTH) + "월 " + date.get(Calendar.DAY_OF_MONTH) + "일";
	}
}

