package ch12;

import java.util.ArrayList;

interface Eatable {}

// 지네릭스는 arrayList 등 여러가지를 담는 작업에 편리하다.
// 기본적인 부모 요소들
class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	
	@Override
	public String toString() {
		return list.toString();
	}
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}
// 나는 과일 상자니까 과일이고 먹을 수 있는 애들만 담아라~

class Fruit implements Eatable {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "fruit";
	}
}

class Apple extends Fruit {
	@Override
	public String toString() {
		return "apple";
	}
}

class Lemon extends Fruit {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "lemon";
	}
}

class Banana extends Fruit {
	@Override
	public String toString() {
		return "banana";
	}
}

class Trash {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "trash";
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Box<Object> box = new Box<Object>();
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Banana> bananaBox = new FruitBox<Banana>();
		FruitBox<Lemon> lemonBox = new FruitBox<Lemon>();
		
		box.add(new Trash());
		box.add(new Apple());
		box.add(new Banana());
		box.add(new Lemon());
		
		fruitBox.add(new Fruit());
//		fruitBox.add(new Trash()); error > fruitBox는 과일이고 먹을 수 있는 애들만 사용할 수 있다.
		
		appleBox.add(new Apple());
//		appleBox.add(new Banana()); error
		bananaBox.add(new Banana());
		lemonBox.add(new Lemon());
		
		System.out.println(box);
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(bananaBox);
		System.out.println(lemonBox);
	}
}











