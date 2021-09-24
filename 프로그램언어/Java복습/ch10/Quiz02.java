package ch10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		
		System.out.print("날짜를 형식에 맞게 입력해주세요(입력 예 2000/01/01) :");
		String requireDate = sc.nextLine();
		
		try {
			Date date = df.parse(requireDate);
			String result = new SimpleDateFormat("입력하신 날짜는 E요일 입니다.").format(date);
			
			System.out.println(result);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
