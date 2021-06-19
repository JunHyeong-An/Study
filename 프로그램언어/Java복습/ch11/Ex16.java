package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("ID : ");
			String id = sc.next();
			System.out.print("PW : ");
			String pw = sc.next();
			
			if(!map.containsKey(id)) {
				System.out.println("ID가 존재하지 않습니다.");
				continue;
			}
			
			if(map.get(id).equals(pw)) {
				System.out.println("로그인 성공!!!");
				sc.close();
				return;
			}
			else {
				System.out.println("비밀번호가 일치하지 않습니다.");
				continue;
			}
		}
	}
}
