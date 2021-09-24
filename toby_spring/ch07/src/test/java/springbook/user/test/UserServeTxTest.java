package springbook.user.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.qos.logback.classic.Level;
import springbook.user.domain.User;
import springbook.user.service.UserService;
import springbook.user.service.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/testApplicationContext.xml")
public class UserServeTxTest {
	@Autowired
	ApplicationContext context;
	
//	@Autowired
//	FactoryBean<Object> factory;
	UserService userService;
	
	private User user1, user2, user3, user4;
	private List<User> list = new ArrayList<User>();
	@Before
	public void setUp() throws Throwable {
//		userService = (UserService)factory.getObject();
		ProxyFactoryBean txProxyFactory = 
				context.getBean("&proxyBean", ProxyFactoryBean.class);
		System.out.println(txProxyFactory);
		userService = (UserService)txProxyFactory.getObject();
		// change
		user1 = new User("hello", "1234", "홍길동", "user1@gmail.com", 1, UserServiceImpl.MIN_LOGCOUNT_FOR_SILVER, 0);
		user1.setEmail("hello@naver.com");
		// not change
		user2 = new User("guymee", "1234", "user1@gmail.com", "김길동");
		user2.setEmail("guymee@gmail.com");
		// change
		user3 = new User("leesw12", "1234", "고길동", "user1@gmail.com", 2, UserServiceImpl.MIN_LOGCOUNT_FOR_SILVER+5 , UserServiceImpl.MIN_RECCOMNED_FOR_GOLD + 20);
		user3.setEmail("leesw12@gmail.com");
		// change
		user4 = new User("bumjin", "1234", "이길동", "user1@gmail.com", 2, UserServiceImpl.MIN_LOGCOUNT_FOR_SILVER+50, UserServiceImpl.MIN_RECCOMNED_FOR_GOLD + 10);
		user4.setEmail("bumjin@naver.com");
		userService.deleteAll();
		
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
	}
	
	@Test
	public void upgradeOrNothing() {
		
		for(User user : list) 
			userService.add(user);
		
		userService.upgradeLevels();
		System.out.println(userService.get(user1.getId()));
	}
}
