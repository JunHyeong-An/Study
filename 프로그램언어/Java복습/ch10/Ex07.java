package ch10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex07 {
	public static void main(String[] args) {
		String sdf = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String sdf2 = new SimpleDateFormat("''yy년 M월 dd일 E요일").format(new Date());
		String sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
		String sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a").format(new Date());
		String sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.").format(new Date());
		String sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.").format(new Date());
		String sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.").format(new Date());
		String sdf8 = new SimpleDateFormat("오늘은 이 달의 W번째 주입니다.").format(new Date());
		String sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.").format(new Date());
		
		System.out.println(sdf);
		System.out.println(sdf2);
		System.out.println(sdf3);
		System.out.println(sdf4);
		System.out.println();
		System.out.println(sdf5);
		System.out.println(sdf6);
		System.out.println(sdf7);
		System.out.println(sdf8);
		System.out.println(sdf9);
		
	}
}
