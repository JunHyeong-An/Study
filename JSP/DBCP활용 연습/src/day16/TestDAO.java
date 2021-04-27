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
	private DataSource ds;		// �������� Connection�� �����ϰ� �ִ� ��ü
	
	public TestDAO() {
		try {
			init = (Context) new InitialContext();
			ds = (DataSource) init.lookup("java:comp/env/jdbc/oracle");	// java:comp/env/���� ������ ���� �ڿ��� web.xml�� �ִ� 
																		// <res-ref-name>jdbc/oracle</res-ref-name>����� ��ġ�ؾ���
		} catch (NamingException e) {
			System.out.println("������ ���� �߻� : " + e);
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
			System.out.println("Ȱ��ȭ ���� ���� : " + bds.getNumActive());
			System.out.println("�ִ� Ȱ��ȭ ���� : " + bds.getMaxTotal());
			System.out.println("���� ���� ���� : " + bds.getNumIdle());
			System.out.println("�ִ� ���� ���� : " + bds.getMaxIdle());
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
