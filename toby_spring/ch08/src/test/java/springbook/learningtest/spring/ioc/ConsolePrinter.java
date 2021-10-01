package springbook.learningtest.spring.ioc;

public class ConsolePrinter implements Printer {
	public void print(String message) {
	
		System.out.println(message);
	}
}
