package ch12;

import java.util.ArrayList;

class Product {}

class Tv extends Product {}

class Audio extends Product {}

public class Ex01 {
	// Box<String> b = new Box<String>();
	// 	    대입된 타입
	// 컴파일 후에는 대입된 타입은 제거되고 다시 원시 타입으로 돌아온다.
	// 컴파일 전에 지네릭스가 올바른 타입을 넣고있는지 검사만 해준다.
	
	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		
		tvList.add(new Tv());
		tvList.add(new Tv());
		
		list.add(new Tv());
		list.add(new Audio());
		
		printAll(list);
		//printAll(tvList); 컴파일 에러(printAll 함수는 지네릭스를 사용해서 product를 담은 list만 매개변수로 받아올수 있기 때문이다.
	}
	
	public static void printAll(ArrayList<Product> list) {
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
