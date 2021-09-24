package ch11;

import java.util.HashSet;

class SutdaCard {
	int num;
	boolean isKwang;
	
	public SutdaCard() {
		this(1, true);
	}

	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof SutdaCard) {
			SutdaCard s = (SutdaCard)obj;
			return s.num == this.num && s.isKwang == this.isKwang;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
	
	@Override
	public int hashCode() {
		return num + (isKwang ? 1 : 0);
	}
}

public class Quiz05 {
	public static void main(String[] args) {
		SutdaCard s1 = new SutdaCard(3, true);
		SutdaCard s2 = new SutdaCard(3, true);
		SutdaCard s3 = new SutdaCard(1, true);
		SutdaCard s4 = new SutdaCard(3, false);
		
		HashSet<SutdaCard> set = new HashSet<SutdaCard>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(set);
	}
}
