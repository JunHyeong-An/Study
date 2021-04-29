package ch01;

public class Quiz13 {
	public static void main(String[] args) {
		System.out.print("  | ");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%2d ", i);
		}System.out.println();
		
		for(int i = 0; i < 30; i++) {
			if(i == 2) System.out.print("+");
			System.out.print("-");
		}System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			System.out.print(i + " | ");
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%2d ", i+j);
			}System.out.println();
		}
	}
}
