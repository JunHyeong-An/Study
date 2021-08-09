package springbook.user.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DAOFactory {
	@Bean
	public ConnectionMaker realConnectionMaker() {
		return new NDriverConnection();
	}
	
	@Bean
	public ConnectionMaker connectionMaker() {
		CountingConnectionMaker connectionMaker = new CountingConnectionMaker();
		connectionMaker.setConnectionMaker(realConnectionMaker());
		
		return connectionMaker;
	}
	@Bean
	public UserDAO userDAO() {
		ConnectionMaker connectionMaker = connectionMaker();
		UserDAO userDAO = new UserDAO();
		userDAO.setConnectionMaker(connectionMaker);
		
		return userDAO;
	}
}
