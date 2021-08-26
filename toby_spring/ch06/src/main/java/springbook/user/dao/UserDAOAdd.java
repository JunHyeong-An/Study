package springbook.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import springbook.user.domain.User;

public class UserDAOAdd implements StatementStrategy {
	User user;
	
	public UserDAOAdd(User user) {
		this.user = user;
	}


	public PreparedStatement makePreparedStatement(Connection con) {
		String sql = "insert into users(id, name, pw) values (?, ?, ?)";
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getId());
			ps.setString(2, user.getName());
			ps.setString(3, user.getPw());
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return ps;
	}
}
