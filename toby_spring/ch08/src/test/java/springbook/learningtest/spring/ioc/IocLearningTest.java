package springbook.learningtest.spring.ioc;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
	
	@Test
	public void genericApplicationContextTest() {
		GenericApplicationContext context = 
				new GenericApplicationContext();
		
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(context);
		reader.loadBeanDefinitions("springbook/learningtest/spring/ioc/TestGenericApplicationContext.xml");
		context.refresh();
		
		Hello hello = context.getBean("hello", Hello.class);
		hello.print();
		
		assertThat(context.getBean("printer").toString(), is("Hello Spring"));
	}
	
	@Test
	public void parentContextTest() {
		ApplicationContext parent =
				new GenericXmlApplicationContext("classpath:parentContext.xml");
		
		Hello hello = parent.getBean("hello", Hello.class);
		hello.print();
		
		assertThat(hello.printer.toString(), is("Hello Parent"));
		
		GenericApplicationContext child =
				new GenericApplicationContext(parent);
		
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(child);
		reader.loadBeanDefinitions("classpath:childContext.xml");
		
		child.refresh();
		
		Hello hello2 = child.getBean("hello", Hello.class);
		hello2.print();
		assertThat(hello2.printer.toString(), is("Hello Child"));
	}
}
