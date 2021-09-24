package day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBTest {
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "c##itbank";
	private static final String pw = "it";
	
	private static Connection con;
	private static Statement st;
	private static ResultSet rs;
	
	public static void main(String[] args) {
		String sql = "select * from v$version";
		ArrayList<Object> list = new ArrayList<Object>();
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pw);
			st = con.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				String banner = rs.getString("banner");
				String banner_full = rs.getString("banner_full");
				String banner_legacy = rs.getString("banner_legacy");
				int con_id = rs.getInt("con_id");
				list.add(banner);
				list.add(banner_full);
				list.add(banner_legacy);
				list.add(con_id);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {	// 접속 여부에 상관없이 꼭 마루리를 해주자. 마무리가 안되면 다음 접속시 접속이 안될 수도 있다.
			try {
				if(rs != null) rs.close();
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		list.forEach(System.out::println);
	}
}




