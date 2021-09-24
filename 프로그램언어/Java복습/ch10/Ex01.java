package ch10;

import java.util.Calendar;

public class Ex01 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		System.out.println("이해의 년도 : " + cal.get(Calendar.YEAR));
		System.out.println("월(0~11, 0 : 1월) : " + cal.get(Calendar.MONTH));
		System.out.println("이 해의 몇 째 주 : "  + cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주 : "  + cal.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("이 달의 몇 일 : " + cal.get(Calendar.DATE));
		System.out.println("이 달의 몇 일 : " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 몇 일 : " + cal.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일 : " + cal.get(Calendar.DAY_OF_WEEK));	// 1 : 일요일, 2 : 월요일, ..... 7 : 토요일
		
		System.out.println("오전 or 오후 : " + cal.get(Calendar.AM_PM));	// 0 : am , 1 : pm
		System.out.println("시간 : " + cal.get(Calendar.HOUR));
		System.out.println("시간 : " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : " + cal.get(Calendar.MINUTE));
		System.out.println("초 : " + cal.get(Calendar.SECOND));
		
		System.out.println("TimeZone : " );
	}
}
