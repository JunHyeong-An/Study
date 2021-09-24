package springbook.user.proxyStudyTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import springbook.user.proxyStudy.Hello;
import springbook.user.proxyStudy.HelloTarget;
import springbook.user.proxyStudy.HelloUppercase;

public class ProxyTest {
	@Test
	public void simpleProxy() {
		Hello hello = new HelloTarget();
		assertThat(hello.sayHello("toby"), is("Hello toby"));
		assertThat(hello.sayHi("toby"), is("Hi toby"));
		assertThat(hello.sayThankyou("toby"), is("Thank You toby"));
	}
	
	@Test
	public void uppercaseProxyTest() {
		Hello hello = new HelloUppercase(new HelloTarget());
		
		assertThat(hello.sayHello("toby"), is("HELLO TOBY"));
		assertThat(hello.sayHi("toby"), is("HI TOBY"));
		assertThat(hello.sayThankyou("toby"), is("THANK YOU TOBY"));
	}
}
