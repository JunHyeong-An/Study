package ch07;

class Point {
	int x ,y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showLocation() {
		System.out.printf("x : %d, y : %d", x, y);
	}
}

class Point3D extends Point {
	int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	public void showLocation() {
		System.out.printf("x : %d, y : %d, z : %d", x, y, z);
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		
		p.showLocation();
	}
}
