package springbook.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAODeleteAll implements StatementStrategy {
	@Override
	public PreparedStatement makePreparedStatement(Connection con) {
		String sql = "truncate users";
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return ps;
	}
}
