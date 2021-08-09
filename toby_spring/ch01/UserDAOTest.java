package springbook.user.domain;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserDAOTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		UserDAO dao;
//		UserDAO dao2;
//		UserDAO dao3;
		
//		ApplicationContext context = 
//				new AnnotationConfigApplicationContext(DAOFactory.class);
		
//		dao = context.getBean("userDAO", UserDAO.class);
//		dao2 = context.getBean("userDAO", UserDAO.class);
//		dao3 = context.getBean("userDAO", UserDAO.class);
		
//		User user1 = new User();
//		user1.setId("Hello1");
//		user1.setPw("123123");
//		user1.setName("john");
//		dao.deleteAll();
//		dao.add(user1);
//		
//		System.out.println(dao.get("Hello1"));
//		
//		
//		CountingConnectionMaker ccm = 
//				context.getBean("connectionMaker", CountingConnectionMaker.class);
//		System.out.println("count : " + ccm.getCnt());
//		System.out.println(dao);
//		System.out.println(dao2);
//		System.out.println(dao3); // singleton
		
		ApplicationContext context = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
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
