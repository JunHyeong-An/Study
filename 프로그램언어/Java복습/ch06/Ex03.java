package ch06;

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}

public class Ex03 {
	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1.kind : " + c1.kind);
		System.out.println("c1.number : " + c1.number);
		System.out.println("c1.width : " + Card.width);
		System.out.println("c1.height : " + Card.height);
		System.out.println();
		
		System.out.println("c2.kind : " + c2.kind);
		System.out.println("c2.number : " + c2.number);
		System.out.println("c2.width : " + Card.width);
		System.out.println("c2.height : " + Card.height);
		
//		c1.width = 300;
		Card.width = 300;
		
		System.out.println("=======================");
		System.out.println("c1.kind : " + c1.kind);
		System.out.println("c1.number : " + c1.number);
		System.out.println("c1.width : " + Card.width);
		System.out.println("c1.height : " + Card.height);
		System.out.println();
		
		System.out.println("c2.kind : " + c2.kind);
		System.out.println("c2.number : " + c2.number);
		System.out.println("c2.width : " + Card.width);
		System.out.println("c2.height : " + Card.height);
	}
}
