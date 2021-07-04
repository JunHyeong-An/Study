package day07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookMemberDAO {
	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String dbId = "c##itbank";
	private final String dbPw = "it";
	private final String driver = "oracle.jdbc.driver.OracleDriver";
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public BookMemberDAO() {
		try {
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, dbId, dbPw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public BookMemberDTO login(BookMemberDTO inputDTO) {
		String sql = "select * from bookmember where id=? and pw=?";
		BookMemberDTO dto = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, inputDTO.getId());
			ps.setString(2, inputDTO.getPw());
			rs = ps.executeQuery();
			
			if(rs.next()) {
				dto = new BookMemberDTO();

				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}
}
