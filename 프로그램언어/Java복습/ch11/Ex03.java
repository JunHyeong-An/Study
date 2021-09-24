package ch11;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Ex03 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		@SuppressWarnings("rawtypes")
		Stack st = new Stack<Integer>();
		
		String exp = "";
		
		System.out.print("Usage = \"Expression\" : ");
		exp = sc.nextLine();
		
		try {
			for(int i = 0; i < exp.length(); i++) {
				if(exp.charAt(i) == '(') {
					st.push(exp.charAt(i));
				}
				else 
					st.pop();
			}
			
			if(st.empty())
				System.out.println("괄호가 일치합니다.");
			else 
				System.out.println("괄호가 일치하지 않습니다.");
		} catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.");
		}
		
		
		sc.close();
	}
}
