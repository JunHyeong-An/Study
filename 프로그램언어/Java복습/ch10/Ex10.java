package ch10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex10 {
	static public String toString(Calendar cal) {
		return String.format("%s/%s/%s", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
	}
	
	static public String toString(Date date) {
		DateFormat df = new SimpleDateFormat("yyyy/mm/dd");
		String result = df.format(date);
		return result;
	}
	
	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner sc = new Scanner(System.in);
		
		Date inDate = null;
		
		System.out.print("날짜를 " + pattern + "의 형태로 입력해주세요(입력 예 : 2019/05/04) : ");
		
		while(sc.hasNextLine()) {
			try {
				inDate = df.parse(sc.nextLine());
				break;
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);		// 오늘 ex)6월 5일 이면 6월 5일 00시로 들어간다.
		
		Calendar today = Calendar.getInstance();
		long hour;
		
		hour = cal.getTimeInMillis() - today.getTimeInMillis();
		hour = (Math.abs(hour)) / (1000 * 60 * 60 * 24);
		
		System.out.println("입력하신 날짜는 현재와 " + hour + "일 차이가 있습니다.");
		sc.close();
	}
}
