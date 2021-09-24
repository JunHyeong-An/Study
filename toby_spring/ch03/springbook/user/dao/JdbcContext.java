package springbook.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	
	public ResultSet jdbcContextWithStatementStrategyResultSet(StatementStrategy st) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = dataSource.getConnection();
			ps = st.makePreparedStatement(con);
			
			rs = ps.executeQuery();
			
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
		return rs;
	}
}
