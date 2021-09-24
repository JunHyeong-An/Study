package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex02 {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		
		st.push(1);
		st.push(2);
		st.push(3);
		
		q.offer(1);
		q.offer(2);
		q.offer(3);
		
		while(!st.empty())
			System.out.println("st : " + st.pop());
		
		while(!q.isEmpty())
			System.out.println("q : " + q.poll());
	}
}
