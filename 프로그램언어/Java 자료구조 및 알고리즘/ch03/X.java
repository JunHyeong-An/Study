package ch03;

import java.util.Comparator;

public class X {
	public static final Comparator<X> COMPARATOR = new Comp();
	
	private static class Comp implements Comparator<X> {
		public int compare(X o1, X o2) {
			return -1;
		};
	}
}
