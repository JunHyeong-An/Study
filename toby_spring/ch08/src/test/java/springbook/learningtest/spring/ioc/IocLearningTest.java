package springbook.learningtest.spring.ioc;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.support.StaticApplicationContext;

public class IocLearningTest {
	@Test
	public void learningStaticContextTest() {
		StaticApplicationContext context = 
				new StaticApplicationContext();

		context.registerSingleton("hello1", Hello.class);
		
		Hello hello1 = context.getBean("hello1", Hello.class);
		assertThat(hello1, is(notNullValue()));
		
		RootBeanDefinition helloDef = new RootBeanDefinition(Hello.class);
		helloDef.getPropertyValues().addPropertyValue("name", "Spring");
		context.registerBeanDefinition("hello2", helloDef);
		
		Hello hello2 = context.getBean("hello2", Hello.class);
		assertThat(hello1, is(not(hello2)));
		
		assertThat(context.getBeanFactory().getBeanDefinitionCount(), is(2));
	}
	
	@Test
	public void registerBeanWithDependency() {
		StaticApplicationContext ac = new StaticApplicationContext();
		ac.registerSingleton("hello", Hello.class);
		ac.registerSingleton("printer", StringPrinter.class);
		
		RootBeanDefinition def = new RootBeanDefinition(Hello.class);
		def.getPropertyValues().addPropertyValue("name", "spring");
		def.getPropertyValues().addPropertyValue("printer", ac.getBean("printer", StringPrinter.class));
		ac.registerBeanDefinition("hello", def);
		
		Hello hello = ac.getBean("hello", Hello.class);
		assertThat(hello, is(notNullValue()));
		assertThat(hello.sayHello(), is("Hello spring"));
	}
}
