package ch10;

import java.util.Calendar;

public class Ex02 {
	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = new String[] {"", "일", "월", "화", "수", "목","금", "토"};
		
		Calendar data1 = Calendar.getInstance();
		Calendar data2 = Calendar.getInstance();
		
		System.out.println("오늘 요일 : " + DAY_OF_WEEK[data1.get(Calendar.DAY_OF_WEEK)]);
		
		data1.set(2021, 5, 27);	//	27은 오늘이니까 그 전 날까지의 차이만 계산
		data2.set(2021, 5, 20);
		
		System.out.println(toString(data1));
		System.out.println(toString(data2));
		
		long diff = (data1.getTimeInMillis() - data2.getTimeInMillis()) / 1000;
		diff = Math.abs(diff);
		System.out.println(diff / (60 * 60 * 24));
		
		
		
	}
	static String toString(Calendar data) {
		String result = String.format("오늘은 %d년 %d월 %d일 입니다.", 
				data.get(Calendar.YEAR), data.get(Calendar.MONTH), data.get(Calendar.DAY_OF_MONTH));
		
		return result;
	}
}
