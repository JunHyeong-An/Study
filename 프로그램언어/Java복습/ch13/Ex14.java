package ch13;

import java.util.ArrayList;

class Customer implements Runnable {
	private Table table;
	private String food;
	
	public Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}

	@Override
	public void run() {
		while(true) {
			try { Thread.sleep(1000);} catch (Exception e) {}
			String name = Thread.currentThread().getName();
			
			if(eatFood()) System.out.println(name + "ate a" + food);
			else System.out.println(name + " fail to eat. :(");
		}
	}
	boolean eatFood() { return table.remove(food); }
}

class Cook implements Runnable {
	private Table table;
	
	public Cook(Table table) {
		this.table = table;
	}

	@Override
	public void run() {
		while(true) {
			int idx = (int)(Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			try { Thread.sleep(1000);} catch (Exception e) {}
		}
	}
}

class Table {
	String[] dishNames = { "donut", "donut", "burger" };
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<String>();
	
	public synchronized void add(String dish) {
		if(dishes.size() >= MAX_FOOD) return;
		
		dishes.add(dish);
		System.out.println("Dishes : " + dishes.toString());
	}
	
	public boolean remove(String dishName) {
		synchronized (this) {
			while(dishes.size() == 0) {
				String name = Thread.currentThread().getName();
				System.out.println(name + "is waiting...");
				try { Thread.sleep(1000);} catch (Exception e) {}
			}
			
			for(int i = 0; i < dishes.size(); i++) {
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i);
					return true;
				}
			}
		}
		return false;
	}
	
	public int dishNum() { return dishNames.length;}
}

public class Ex14 {
	public static void main(String[] args) throws InterruptedException {
		Table table = new Table();
		
		new Thread(new Cook(table), "COOK").start();
		new Thread(new Customer(table, "donut"), "CUST1").start();
		new Thread(new Customer(table, "burger"), "CUST2").start();
		
		Thread.sleep(1000);
		System.exit(0);
	}
}
