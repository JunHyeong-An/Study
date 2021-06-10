package ch10;

import java.text.DecimalFormat;

public class Ex06 {
	public static void main(String[] args) {
		String[] pattern = {
				"#.####",			// #으로 지정한 수보다 자릿수가 더 크면 맨끝부터 반올림함
				"0000000.0000",		// 남는자리는 0으로 채움
				"000,000,000.####",
				"-#.#",
				"#.#-"
		};
		double number = 12345678.9;
		
		for(int i = 0; i < pattern.length; i++) {
			DecimalFormat df = new DecimalFormat(pattern[i]);
			System.out.println(pattern[i] + " : " + df.format(number));
		}
	}
}
