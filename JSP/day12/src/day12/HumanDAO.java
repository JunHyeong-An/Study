package day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class HumanDAO {	// Human 테이블의 데이터에 접근하는 객체
						// Database Access Object
	
	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String user = "c##itbank";
	private final String pw = "it";
	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public HumanDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Human> getHumanList() {
		String sql = "select * from human order by age";
		ArrayList<Human> list = new ArrayList<Human>();
		
		try {
			st = con.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				Human h = new Human();
				h.setName(rs.getString("name"));
				h.setAge(rs.getInt("age"));
				list.add(h);
			}
		} catch (SQLException e) {
			System.out.println("getHumanList : " + e);
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









