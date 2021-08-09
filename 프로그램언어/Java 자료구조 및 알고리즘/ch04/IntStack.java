package ch04;

import java.util.EmptyStackException;

public class IntStack {
	private int max, ptr;
	private int[] stk;
	
	public class EmptyIntStackException extends RuntimeException {
		private static final long serialVersionUID = 1L;
		public EmptyIntStackException() {}
	}
	
	public class OverflowIntStackEception extends RuntimeException {
		private static final long serialVersionUID = 1L;
		public OverflowIntStackEception() {}
	}
	
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int push(int x) throws OverflowIntStackEception {
		if(ptr >= max)
			throw new OverflowIntStackEception();
		return stk[ptr++] = x;
	}
	
	public int pop() throws EmptyStackException {
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr--];
	}
	
	public int peak() throws EmptyStackException {
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}
}
