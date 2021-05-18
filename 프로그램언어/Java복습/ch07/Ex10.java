package ch07;

abstract class Unit {
	int x, y;
	
	abstract void move(int x, int y);
	void stop() {};
}

class Marine extends Unit {
	@Override
	void move(int x, int y) {
		System.out.println("Marine [x=" + x + ", y=" + y + "]");
	}
	void stimpack() {};
}

class Tank extends Unit {
	@Override
	void move(int x, int y) {
		System.out.println("Tank [x=" + x + ", y=" + y + "]");
	}
	void changeMode() {}
}

class Dropship extends Unit {
	@Override
	void move(int x, int y) {
		System.out.println("Dropship [x=" + x + ", y=" + y + "]");
	}
	void unload() {}
}

public class Ex10 {
	public static void main(String[] args) {
		Unit[] group = new Unit[] {new Marine(), new Tank(), new Dropship()};
		
		for(int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
		}
		
	}
}
