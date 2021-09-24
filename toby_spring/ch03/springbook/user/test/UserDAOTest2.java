package springbook.user.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springbook.user.dao.UserDAO;
import springbook.user.domain.DAOFactory;
import springbook.user.domain.User;

public class UserDAOTest2 {
	public static void main(String[] args) throws SQLException {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(DAOFactory.class);
		
		UserDAO dao = context.getBean("userDAO", UserDAO.class);
		
		User user1 = new User();
		user1.setId("Hello1");
		user1.setPw("123123");
		user1.setName("john");
		dao.deleteAll();
		dao.add(user1);
		System.out.println(dao.get("Hello1"));
	}
}
