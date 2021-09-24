package springbook.user.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;

public class UserDAO {
//	ConnectionMaker connectionMaker;
//	Connection con;
	
//	public void setConnectionMaker(ConnectionMaker connectionMaker) {
//		this.connectionMaker = connectionMaker;
//	}
	
	DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void add(User user) {
		try {		
			Connection con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into users values (?, ?, ?)");
			ps.setString(1, user.getId());
			ps.setString(2, user.getName());
			ps.setString(3, user.getPw());
			
			ps.executeUpdate();
			
			ps.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteAll() throws SQLException {
		String sql = "truncate users";
		Connection con = dataSource.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.executeUpdate();
		
		ps.close();
		con.close();
	}
	
	public User get(String id) throws SQLException {
		String sql = "select * from users where id = ?";
		User user = null;
		Connection con = dataSource.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			user = new User();
			user.setId(rs.getString("id"));
			user.setPw(rs.getString("pw"));
			user.setName(rs.getString("name"));
		}
		
		if(user == null) throw new EmptyResultDataAccessException(1);
		rs.close();
		ps.close();
		con.close();
		
		return user;
	}
	
	public int getCount() throws SQLException {
		String sql = "select count(*) from users";
		Connection con = dataSource.getConnection();
		
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		rs.next();
		int count = rs.getInt(1);
		rs.close();
		ps.close();
		con.close();
		
		return count;
	}
}
