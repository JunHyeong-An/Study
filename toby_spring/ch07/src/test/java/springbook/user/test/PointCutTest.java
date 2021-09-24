package springbook.user.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.util.PatternMatchUtils;

import springbook.user.proxyStudy.Hello;
import springbook.user.proxyStudy.HelloTarget;

public class PointCutTest {
	@Test
	public void classMethodPointcutAdvice() {
		NameMatchMethodPointcut classMethodPointcut = new NameMatchMethodPointcut();
		
		classMethodPointcut.setMappedName("sayH*");
		classMethodPointcut.setClassFilter(new ClassFilter() {
			@Override
			public boolean matches(Class<?> clazz) {
				return PatternMatchUtils.simpleMatch("HelloT*", clazz.getSimpleName());
			}
		});
		
		checkAdviced(new HelloTarget(), classMethodPointcut, true);
	}
	
	private void checkAdviced(Object target, Pointcut pointcut, boolean adviced) {
		ProxyFactoryBean pfbean = new ProxyFactoryBean();
		pfbean.setTarget(target);
		pfbean.addAdvisor(new DefaultPointcutAdvisor(pointcut, new UppercaseAdvice()));
		Hello proxiedHello = (Hello)pfbean.getObject();
		
		if(adviced) {
			assertThat(proxiedHello.sayHello("Toby"), is("HELLO TOBY"));
			assertThat(proxiedHello.sayHi("Toby"), is("HI TOBY"));
			assertThat(proxiedHello.sayThankyou("Toby"), is("Thank You Toby"));
		}
		else {
			assertThat(proxiedHello.sayHello("Toby"), is("Hello Toby"));
			assertThat(proxiedHello.sayHi("Toby"), is("Hi Toby"));
			assertThat(proxiedHello.sayThankyou("Toby"), is("Thank You Toby"));
		}
	}
}

