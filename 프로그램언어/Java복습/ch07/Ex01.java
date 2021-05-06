package ch07;

class Tv { 
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {this.channel++;}
	void chaannelDown() {this.channel--;}
}

class SmartTv extends Tv {
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

public class Ex01 {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		stv.displayCaption("Hello, world");
		stv.caption = true;
		stv.displayCaption("Hello, world");
	}
}
