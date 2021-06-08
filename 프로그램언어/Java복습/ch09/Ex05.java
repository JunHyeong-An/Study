package ch09;

class Card2 {
	String kind;
	int number;
	
	public Card2() {
		this.kind = "SPADE";
		this.number = 1;
	}
	
	public Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "kind : " + this.kind +", number : " + this.number;
	}
}

public class Ex05 {
	public static void main(String[] args) {
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("HEART", 5);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
