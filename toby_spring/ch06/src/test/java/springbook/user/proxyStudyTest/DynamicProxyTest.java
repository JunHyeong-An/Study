package springbook.user.proxyStudyTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

import springbook.user.proxyStudy.Hello;
import springbook.user.proxyStudy.HelloTarget;


public class DynamicProxyTest {
//	@Test
//	public void simpleProxy() {
//		Hello proxiedHello = 
//				(Hello) Proxy.newProxyInstance(getClass().getClassLoader(), 
//				new Class[] {Hello.class}, 
//				new UppercaseHandler(new HelloTarget()));
//		
//	}
	
	@Test
	public void proxyFactoryBean() {
		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
		pointcut.setMappedName("sayH*");
		
		ProxyFactoryBean pfBean = new ProxyFactoryBean();
		pfBean.setTarget(new HelloTarget());
		pfBean.addAdvisor(new DefaultPointcutAdvisor(pointcut, new UppercaseAdvice()));
		
		Hello proxiedHello = (Hello)pfBean.getObject();
		
		assertThat(proxiedHello.sayHello("Toby"), is("HELLO TOBY"));
		assertThat(proxiedHello.sayThankyou("Toby"), is("Thank You Toby"));
		
	}
	
	static class UppercaseAdvice implements MethodInterceptor {
		@Override
		public Object invoke(MethodInvocation invocation) throws Throwable {
			String ret = (String) invocation.proceed();
			return ret.toUpperCase();
		}
	}
}
