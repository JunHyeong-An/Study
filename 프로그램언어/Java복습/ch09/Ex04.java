package ch09;

class Card {
	String kind;
	int number;
	
	public Card() {
		this.kind = "SPADE";
		this.number = 1;
	}
	
	public Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
