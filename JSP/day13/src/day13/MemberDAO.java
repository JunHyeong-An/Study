package day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {	// Database Access Object
	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String user = "c##itbank";
	private final String upw = "it";
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, upw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<MemberDTO> getMemberList() {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		String sql = "select * from member";
		try {
			st = con.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return list;
	}
	
	public List<MemberDTO> getMember(String id) {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		String sql = "select * from member where id = \'" + id + "\'";
		
		try {
			st = con.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				
				list.add(dto);
				System.out.println(list);
				return list;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;	
	}
}












