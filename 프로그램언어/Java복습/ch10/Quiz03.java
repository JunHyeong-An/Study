package ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Quiz03 {
	static int payCheck(Calendar from, Calendar to) {
		int monDiff = 0;
		
		if(from.get(Calendar.MONTH) > to.get(Calendar.MONTH))
			return 0;
		if(from.get(Calendar.MONTH) == to.get(Calendar.MONTH))
			monDiff--;
		
//		if(from.get(Calendar.MONTH) == to.get(Calendar.MONTH)
//				&& from.get(Calendar.DATE) == 21 && to.get(Calendar.DATE) == 21)
//			return 1;
		
		monDiff += from.get(Calendar.DATE) <= 21 ? 1 : 0;
		monDiff += to.get(Calendar.DATE) >= 21 ? 1 : 0;
		monDiff += from.get(Calendar.MONTH) == to.get(Calendar.MONTH) ?
				0 : Math.abs(from.get(Calendar.MONTH) - to.get(Calendar.MONTH)) - 1;
		
		return monDiff;
	}
	
	static void showResult(Calendar from, Calendar to) {
		Date fromDate = from.getTime();
		Date toDate = to.getTime();
		
		String fromStr = new SimpleDateFormat("yyyy-MM-dd").format(fromDate);
		String toStr = new SimpleDateFormat("yyyy-MM-dd").format(toDate);
		
		String result = String.format("%s ~ %s:%d", fromStr, toStr, payCheck(from, to));
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Calendar from = Calendar.getInstance();
		Calendar to = Calendar.getInstance();
		
		from.set(2021, 2, 20);
		to.set(2021, 5, 4);
		showResult(from, to);
	}
}
