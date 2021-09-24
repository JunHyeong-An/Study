package springbook.user.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import springbook.user.dao.UserDAO;
import springbook.user.domain.User;

public class UserDAOTest4 {
	private UserDAO userDAO;
	private User user1, user2, user3, user4;
	
	@Before
	public void setUp() {
		ApplicationContext context = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		userDAO = context.getBean("userDAO", UserDAO.class);
		
		user1 = new User();
		user1.setId("Hello");
		user1.setPw("1234");
		user1.setName("홍길동");
		
		user2 = new User("guymee", "1234", "김길동");
		user3 = new User("leesw12", "1234", "고길동");
		user4 = new User("bumjin", "1234", "이길동");
	}
	
	@Test
	public void addAndGet() throws SQLException {
		userDAO.deleteAll();
		
		userDAO.add(user1);

		User userTest = userDAO.get("Hello");
		
		assertThat(userTest.getId(), is("Hello"));
		assertThat(userTest.getPw(), is("1234"));
		assertThat(userTest.getName(), is("홍길동"));
	}
	
	@Test
	public void count() throws SQLException {
		userDAO.deleteAll();
		assertThat(userDAO.getCount(), is(0));
		
		userDAO.add(user1);
		assertThat(userDAO.getCount(), is(1));
		userDAO.add(user2);
		assertThat(userDAO.getCount(), is(2));
		userDAO.add(user3);
		assertThat(userDAO.getCount(), is(3));
		userDAO.add(user4);
		assertThat(userDAO.getCount(), is(4));
	}
	
	@Test(expected = EmptyResultDataAccessException.class)
	public void getUserFailure() throws SQLException {
		userDAO.deleteAll();
		assertThat(userDAO.getCount(), is(0));
		
		userDAO.get("unknwon_user");
	}
	
	
	
//	public static void main(String[] args) {
//		JUnitCore.main("springbook.user.domain.UserDAOTest");
//	}
}
