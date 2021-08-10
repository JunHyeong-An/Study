package springbook.user.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springbook.user.dao.UserDAO;
import springbook.user.domain.User;

public class UserDAOTest3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		UserDAO dao = context.getBean("userDAO", UserDAO.class);
		
		User user1 = new User();
		user1.setId("Hello1");
		user1.setPw("123123");
		user1.setName("john");
		dao.deleteAll();
		dao.add(user1);
		
		User user2 = dao.get("Hello1");
		
		if(user2.getId().equals(null)) System.out.println("테스트 실패 id");
		else System.out.println("테스트 성공");
		
		if(user2.getPw().equals(null)) System.out.println("테스트 실패 pw");
		else System.out.println("테스트 성공");
		
		if(user2.getName().equals(null)) System.out.println("테스트 실패 name");
		else System.out.println("테스트 성공");
	}
}
