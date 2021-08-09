package ch04;

import java.util.Scanner;
import java.util.Stack;

public class IntStackTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 64;
		Stack<Integer> stack = new Stack<Integer>();
		
		while(true) {
			System.out.println();
			System.out.println("currData Count : " + stack.size() + "/" + max);
			System.out.println("1)push 2)pop 3)peak 4)dump 0)exit");
			System.out.print(">>> ");
			int menu = sc.nextInt();
			
			switch(menu) {
				case 1:
					if(stack.size() >= max) break;
					System.out.print("enter push number : ");
					int num = sc.nextInt();
					stack.push(num);
					break;
				case 2:
					System.out.println(stack.pop());
					break;
				case 3:
					System.out.println("peek Number : " + stack.peek());
					break;
				case 4:					
					System.out.println(stack.toString());
					break;
				case 0:
					System.out.println("System Exit");
					sc.close();
					return;
				default:
					System.out.println("no menu");
					break;
			}
		}
	}
}
