package springbook.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class JdbcContext {
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public void jdbcContextWithStatementStrategy(StatementStrategy st) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = dataSource.getConnection();
			ps = st.makePreparedStatement(con);
			
			ps.executeUpdate();
			
		} catch (Exception e) {} 
		finally {			
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
	}
	
	public void executeSql(final String sql) {
		this.jdbcContextWithStatementStrategy(new StatementStrategy() {
			
			public PreparedStatement makePreparedStatement(Connection con) {
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
}
