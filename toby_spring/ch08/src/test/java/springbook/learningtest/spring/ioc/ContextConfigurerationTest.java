package springbook.learningtest.spring.ioc;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "TestGenericApplicationContext.xml")
public class ContextConfigurerationTest {
	@Autowired
	Hello hello;

	@Test
	public void contextTest() {
		assertThat(hello, notNullValue());
		hello.print();
		assertThat(hello.printer.toString(), is("Hello Spring"));
	}
}
