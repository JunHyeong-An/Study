package springbook.user.domain;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.mysql.cj.jdbc.Driver;

import springbook.user.dao.UserDAO;

@Configuration
public class DAOFactory {
	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriverClass(Driver.class);
		dataSource.setUrl("jdbc:mysql://localhost:3306/tobySpring");
		dataSource.setUsername("root");
		dataSource.setPassword("1234");
		
		return dataSource;
	}
	
	@Bean
	public ConnectionMaker realConnectionMaker() {
		return new NDriverConnection();
	}
	
	@Bean
	public ConnectionMaker connectionMaker() {
		CountingConnectionMaker connectionMaker = new CountingConnectionMaker();
		connectionMaker.setDataSource(dataSource());
		return connectionMaker;
	}
	@Bean
	public UserDAO userDAO() {
		UserDAO userDAO = new UserDAO();
//		userDAO.setConnectionMaker(connectionMaker);
		userDAO.setDataSource(dataSource());
		return userDAO;
	}
}
