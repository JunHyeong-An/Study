package day16;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class TestDAO {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private Context init;
	private DataSource ds;		// 여러개의 Connection을 보유하고 있는 객체
	
	public TestDAO() {
		try {
			init = (Context) new InitialContext();
			ds = (DataSource) init.lookup("java:comp/env/jdbc/oracle");	// java:comp/env/여기 까지는 고정 뒤에는 web.xml에 있는 
																		// <res-ref-name>jdbc/oracle</res-ref-name>여기랑 일치해야함
		} catch (NamingException e) {
			System.out.println("생성자 예외 발생 : " + e);
		} finally {
			try {
				if(con != null)	con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public String test() {
		String sql = "select * from v$version";
		String result = null;
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				result = rs.getString(1);
				return result;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			BasicDataSource bds = (BasicDataSource)ds;
			System.out.println("활성화 연결 개수 : " + bds.getNumActive());
			System.out.println("최대 활성화 개수 : " + bds.getMaxTotal());
			System.out.println("유휴 연결 개수 : " + bds.getNumIdle());
			System.out.println("최대 유휴 개수 : " + bds.getMaxIdle());
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
