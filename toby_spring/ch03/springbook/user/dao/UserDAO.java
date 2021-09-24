package springbook.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;

import springbook.user.domain.User;

public class UserDAO {
	DataSource dataSource;
	JdbcContext jdbcContext;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void setJdbcContext(JdbcContext jdbcContext) {
		this.jdbcContext = jdbcContext;
	}

	public void add(User user) {
		class Addstatement implements StatementStrategy {
			User user;
			
			public Addstatement(User user) {
				this.user = user;
			}
			
			@Override
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
		StatementStrategy st = new Addstatement(user);
		jdbcContext.jdbcContextWithStatementStrategy(st);
	}
	
	public void deleteAll() {
		jdbcContext.jdbcContextWithStatementStrategy(new StatementStrategy() {
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
		});
	}
	
	public User get(String id) {
		String sql = "select * from users where id = ?";
		User user = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = dataSource.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				user = new User();
				user.setId(rs.getString("id"));
				user.setPw(rs.getString("pw"));
				user.setName(rs.getString("name"));	
			}
			
		} catch (Exception e) {}
		finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (Exception e) {}
			}
			if(ps != null) {
				try {
					ps.close();
				} catch (Exception e) {}
			}
			if(con != null) {
				try {
					con.close();
				} catch (Exception e) {}
			}
		}
		if(user == null) throw new EmptyResultDataAccessException(1);			
		return user;
	}
	
	public int getCount() throws SQLException {
		String sql = "select count(*) from users";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int count = 0;
		
		try {
			con = dataSource.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			rs.next();
			count = rs.getInt(1);			
		} catch (Exception e) {}
		finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (Exception e) {}
			}
			if(ps != null) {
				try {
					ps.close();
				} catch (Exception e) {}
			}
			if(con != null) {
				try {
					con.close();
				} catch (Exception e) {}
			}
		}
		
		return count;
	}
}
