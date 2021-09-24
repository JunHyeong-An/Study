package springbook.user.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springbook.user.dao.UserDAO;
import springbook.user.domain.User;

@RunWith(SpringJUnit4ClassRunner.class	)
@ContextConfiguration(locations = "/testApplicationContext.xml")
public class UserDAOTest4 {
	@Autowired
	private UserDAO userDAO;
	private User user1, user2, user3, user4;
	
	@Before
	public void setUp() {
		user1 = new User();
		user1.setId("zello");
		user1.setPw("1234");
		user1.setName("홍길동");
		
		user2 = new User("guymee", "1234", "김길동");
		user3 = new User("leesw12", "1234", "고길동");
		user4 = new User("bumjin", "1234", "이길동");
		
		userDAO.deleteAll();
	}
	
	@Test
	public void addAndGet() throws SQLException {
		userDAO.add(user1);

		User userTest = userDAO.get("zello");
		
		assertThat(userTest.getId(), is("zello"));
		assertThat(userTest.getPw(), is("1234"));
		assertThat(userTest.getName(), is("홍길동"));
	}
	
	@Test
	public void count() throws SQLException {
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
		assertThat(userDAO.getCount(), is(0));
		
		userDAO.get("unknwon_user");
	}
	
	@Test
	public void getAll() throws SQLException {
		userDAO.add(user1);
		userDAO.add(user2);
		userDAO.add(user3);
		userDAO.add(user4);
		
		List<User> list = userDAO.getAll();
		
		assertThat(list.size(), is(4));
		
		assertThat(user4.getId(), is(list.get(0).getId()));
		assertThat(user2.getId(), is(list.get(1).getId()));
		assertThat(user3.getId(), is(list.get(2).getId()));
		assertThat(user1.getId(), is(list.get(3).getId()));
	}
	
	private void checkSameUser(User user1, User user2) {
		assertThat(user1.getId(), is(user2.getId()));
		assertThat(user1.getPw(), is(user2.getPw()));
		assertThat(user1.getName(), is(user2.getName()));
	}
	
	@Test
	public void nullGet() throws SQLException {
		List<User> list = userDAO.getAll();
		assertThat(list.size(), is(0));
	}
	
	@Test(expected = NoClassDefFoundError.class)
	public void duplicateKey() {
		userDAO.deleteAll();
		
		userDAO.add(user1);
		userDAO.add(user1);
	}
	
}
