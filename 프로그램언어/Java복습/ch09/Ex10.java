package ch09;

public class Ex10 {
	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal);
		
		double dVal = Double.valueOf(iVal);
		String strVal2 = dVal + "";	// 강제 형변환
		
		double sum = Integer.parseInt(strVal) + Double.parseDouble(strVal2);
		
		System.out.println(sum);
		
		
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(sum2);
		
		System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
		System.out.println(strVal + "+" + strVal2 + "=" + sum2  );
											
	}
}
