package springbook.user.factoryBeanTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springbook.user.factoryBeanStudy.Message;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/MessageTestApplicationcontext.xml")
public class FactoryBeanTest {
	@Autowired
	FactoryBean<Message> factory;
	
	@Test
	public void test() throws Exception {
		Message message = factory.getObject();
		assertThat(factory.isSingleton(), is(false));
		assertThat(message.getText(), is("Factory Bean"));
	}
}
