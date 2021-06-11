package ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 2번째 일요일에 해당하는 날짜를 어떻게 구하냐
// ?? = 2020년 각 달의 2번째 일요일에 해당하는 날짜
// df.format(??) 출력
public class Quiz01 {
	static public String toString(Calendar cal) {
		String[] days = {"", "일", "월", "화", "수", "목", "금", "토"};
		return String.format("%s/%s/%s/%s요일/%s번째 주", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE), days[cal.get(Calendar.DAY_OF_WEEK)], cal.get(Calendar.WEEK_OF_MONTH));
	}
	
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd은 W번째 E요일 입니다.");
		Calendar cal = Calendar.getInstance();
		
		for(int i = 0; i < 12; i++) {
			cal.set(2021, i , 1);		// calender의 년월일은 한번에 건들이자
			cal.set(Calendar.WEEK_OF_MONTH, 2);
			cal.set(Calendar.DAY_OF_WEEK, 1);
			
			Date date = cal.getTime();
			String result = df.format(date);
			System.out.println(result);
		}
		
		
		
//		System.out.println(toString(cal));
//		System.out.println(cal.get(Calendar.week));
	}
}
