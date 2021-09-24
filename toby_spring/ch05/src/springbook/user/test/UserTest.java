package springbook.user.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springbook.user.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class UserTest {
	User user;
	
	@Before
	public void setUp() {
		user = new User("Hello", "1234", "홍길동", 1, 0, 0);
	}
	
	@Test
	public void upgradeLevel() {
		user.upgradeLevel();
		assertThat(user.getLevel(), is(2));
	}
}
