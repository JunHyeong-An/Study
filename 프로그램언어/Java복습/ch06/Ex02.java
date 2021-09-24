package ch06;

public class Ex02 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t1.channel = 7;
		t2.channel = 5;
		
		System.out.println("t1의 채널은 : " + t1.channel);
		System.out.println("t2의 채널은 : " + t2.channel);
		
		t1.channelUp();
		t2.channelDown();
		
		System.out.println("t1의 채널은 : " + t1.channel);
		System.out.println("t2의 채널은 : " + t2.channel);
	}
}
