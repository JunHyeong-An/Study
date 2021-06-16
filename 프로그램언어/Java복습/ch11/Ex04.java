package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex04 {
	static void save(String input, Queue<String> history) {
		history.offer(input);
		
		if(history.size() == 6) {
			history.remove();
		}
	}
	
	static void showHelp() {
		System.out.println("help - 도움말을 보여줍니다.");
		System.out.println("q 또는 Q - 프로그램을 종료합니다.");
		System.out.println("history - 최근에 입력한 명령어를 5개 보여줍니다.");
	}
	
	static void showHistory(Queue<String> history) {
		int index = 1;
		while(!(index == 6)) {
			System.out.println(index++ +". " + history.poll());
		}
	}
	
	public static void main(String[] args) {
		String input = "";
		Scanner sc = new Scanner(System.in);
		Queue<String> history = new LinkedList<String>();
		
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(!input.equalsIgnoreCase("q")) {
			System.out.print(">> ");
			input = sc.nextLine();
			
			switch (input) {
			case "help":
				save(input, history);
				showHelp();
				break;
				
			case "history":
				save(input, history);
				showHistory(history);
				break;

			default:
				save(input, history);
				System.out.println(input);
				break;
			}
		}
		
		sc.close();
		
	}
}
