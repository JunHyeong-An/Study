package ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Quiz04 {
	static long calcDayMyBirthToNow(Calendar myBirth) {
		long day = 0;
		Calendar today = Calendar.getInstance();
		
		day = (Math.abs(myBirth.getTimeInMillis() - today.getTimeInMillis())) / (1000 * 60 * 60 * 24);
		
		return day;
	}
	
	static void showResult(Calendar myBirth) {
		Date date = new Date();
		String today = new SimpleDateFormat("yyyy-MM-dd").format(date);
		date = myBirth.getTime();
		String birth = new SimpleDateFormat("yyyy-MM-dd").format(date);
		
		String result = String.format("birth day = %s\ntoday = %s\n%d days", birth, today, calcDayMyBirthToNow(myBirth));
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Calendar myBirth = Calendar.getInstance();
		myBirth.set(1997, 7, 30);
		
		showResult(myBirth);
		
	}
}
