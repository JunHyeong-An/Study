package springbook.user.domain;

import java.sql.SQLException;

public class UserDAOTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserDAO dao = new UserDAO(new NDriverConnection());
		User user1 = new User();
		user1.setId("Hello1");
		user1.setPw("123123");
		user1.setName("john");
		dao.deleteAll();
		dao.add(user1);
		
		System.out.println(dao.get("Hello1"));
	}
}
