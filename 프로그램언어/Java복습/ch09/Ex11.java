package ch09;

public class Ex11 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb == sb2 : " + (sb == sb2));
		System.out.println("sb.equals(sb2) : " + sb.equals(sb2));
		System.out.println("sb.toString().equals(sb2.toString()) : " + sb.toString().equals(sb2.toString()));
	}
}
