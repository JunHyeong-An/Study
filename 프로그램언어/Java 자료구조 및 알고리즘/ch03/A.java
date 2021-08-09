package ch03;

import java.util.Comparator;

class U implements Comparator<A> {
	@Override
	public int compare(A o1, A o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class A implements Comparable<A> {
	@Override
	public int compareTo(A o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
