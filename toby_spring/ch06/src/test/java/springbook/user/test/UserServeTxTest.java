package springbook.user.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springbook.user.domain.User;
import springbook.user.service.TestUserException;
import springbook.user.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/testApplicationContext.xml")
public class UserServeTxTest {
	@Autowired
	UserService userServiceTx;
	
	User user1, user2, user3, user4 ,user5;
	List<User> list = new ArrayList<User>();
	
	@Before
	public void setUp() {
		user1 = new User("user1", "1234", "john", "user1@gmail.com", 2, 83, 31);		// level 3 up
		user2 = new User("user2", "1234", "marry", "user2@gmail.com");
		user3 = new User("user3", "1234", "tom", "user3@gmail.com", 1, 55, 20);		// level 2 up
		user4 = new User("user4", "1234", "bukayo", "user4@gmail.com", 1, 50, 2);
		user5 = new User("user5", "1234", "smith", "user5@gmail.com");
		
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		list.add(user5);
		
		userServiceTx.deleteAll();
	}
	
	@Test
	public void upgradeLevels() {
		for(User user : list) 
			userServiceTx.add(user);
		
		userServiceTx.upgradeLevels();
	}
}
