package springbook.user.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springbook.user.dao.UserDAO;
import springbook.user.domain.Level;
import springbook.user.domain.User;
import springbook.user.service.UserService;
import springbook.user.service.UserServiceImpl;
import springbook.user.service.UserServiceTx;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/testApplicationContext.xml")
public class UserServiceTest {
	@Autowired
	UserServiceImpl us;
	private User user1, user2, user3, user4;
	private List<User> list = new ArrayList<User>();
	@Before
	public void setUp() {
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
		us.deleteAll();
		
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
	}
	
	@Test
	@DirtiesContext
	public void upgradeLevels() throws Exception {
		us.deleteAll();
		user2.setLogin(55);
		user3.setRecommand(33);
		us.add(user2);
		us.add(user3);
		
		us.upgradeLevels();
		checkLevelUpgrade(user2, true);
		checkLevelUpgrade(user3, true);
	}
	
	public void checkLevelUpgrade(User user, boolean upgraded) {
		User userUpdated = us.get(user.getId());
		if(upgraded) 
			assertThat(userUpdated.getLevel(), is(Level.valueOf(user.getLevel()).getNext()) );
		
		else 
			assertThat(userUpdated.getLevel(), is(user.getLevel()));
		
	}
	
	@Test
	public void add() {
		us.deleteAll();
		us.add(user1);
		us.add(user4);
		
		User userWithOutLevel = us.get(user1.getId());
		User userWithLevel = us.get(user4.getId());
		
		assertThat(userWithOutLevel.getLevel(), is(1));
		assertThat(userWithLevel.getLevel(), is(2));
	}
	
	@Test
	public void upgradeAllOrNothing() throws Exception {
		us.deleteAll();
		
		for(User user : list) us.add(user);
		
		us.upgradeLevels();
		
		checkLevelUpgrade(user1, true);
		checkLevelUpgrade(user2, false);
		checkLevelUpgrade(user3, true);
		checkLevelUpgrade(user4, true);
	}
}
