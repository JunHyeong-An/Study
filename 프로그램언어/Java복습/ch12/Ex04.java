package ch12;

import java.util.ArrayList;

interface Eatable2 {}

class Box2<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {list.add(item);}
	T get(int index) {return list.get(index);}
	int size() {return list.size();}
	
	@Override
	public String toString() {return list.toString();}
}

class FruitBox2<T extends Fruit2> extends Box2<T> {}

class Fruit2 implements Eatable2 {}

class Apple2 extends Fruit2 {
	@Override
	public String toString() {return "apple";}
}

class Banana2 extends Fruit2 {
	@Override
	public String toString() {return "Banana";}
}

class Lemon2 extends Fruit2 {
	@Override
	public String toString() {return "Lemon";}
}

class Juice extends Fruit2 {
	String name = "";
	
	public Juice(String name) {
		this.name = name;
	}
	
	void drink() {
		System.out.println(name + "Juice를 마신다.");
	}
}

class Juicer {
	static Juice makeJuice(Fruit2 f) {
		return new Juice(f + " ");
	}
}

public class Ex04 {
	public static void main(String[] args) {
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		
		fruitBox.add(new Apple2());
		fruitBox.add(new Banana2());
		fruitBox.add(new Lemon2());
		
		for(int i = 0; i < fruitBox.size(); i++) {
			Juice j = Juicer.makeJuice(fruitBox.get(i));
			
			j.drink();
		}
		
	}
}
