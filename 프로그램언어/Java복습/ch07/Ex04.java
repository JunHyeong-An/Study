package ch07;

class Point2 {
	int x ,y;
	
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showLocation() {
		System.out.printf("x : %d, y : %d", x, y);
	}
}

class Point3D2 extends Point {
	int z;
	
	public Point3D2(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	public void showLocation() {
		System.out.printf("x : %d, y : %d, z : %d", x, y, z);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Point3D2 p = new Point3D2(1, 2, 3);
		
		p.showLocation();
	}
}
