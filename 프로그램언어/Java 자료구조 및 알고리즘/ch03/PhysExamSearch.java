package ch03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class PhysData {
	private static class HeightOrderComparator implements Comparator<PhysData> {
		@Override
		public int compare(PhysData o1, PhysData o2) {
			int result = 0;
			
			if(o1.height > o2.height) result = 1;
			else if(o1.height < o2.height) result = -1;
			
			return result;
		}
	}
	
	static final Comparator<PhysData> HEIGHT_ORDER =
			new HeightOrderComparator();
	
	private String name;
	private int height;
	private double sight;
	
	public PhysData(String name, int height, double sight) {
		this.name = name;
		this.height = height;
		this.sight = sight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getSight() {
		return sight;
	}
	public void setSight(double sight) {
		this.sight = sight;
	}
	
	
}

public class PhysExamSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PhysData[] x = {
				new PhysData("john", 162, 0.3),
				new PhysData("harley", 171, 0.5),
				new PhysData("marry", 172, 0.7),
				new PhysData("smith", 175, 0.9),
				new PhysData("kevin", 177, 0.4)
		};
		
		System.out.print("cm : ");
		int height = sc.nextInt();
		int idx = Arrays.binarySearch(x, new PhysData("", height, 0.0), PhysData.HEIGHT_ORDER);
		
		if(idx < 0) System.out.println("no result");
		else {
			System.out.println(idx);
			System.out.println("found data : " + x[idx].getName());
		}
		
		sc.close();
	}
}
