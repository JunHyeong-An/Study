package ch10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09 {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date date = df.parse("2019-06-05");
			
			System.out.println(df2.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
