package day07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String dbId = "c##itbank";
	private final String dbPw = "it";
	private final String driver = "oracle.jdbc.driver.OracleDriver";
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public BookDAO() {
		try {
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, dbId, dbPw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 책목록 불러오기
	public List<BookDTO> getBookList() {
		String sql = "select * from book";
		List<BookDTO> list = new ArrayList<BookDTO>();
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				BookDTO dto = new BookDTO();
				dto.setName(rs.getString("name"));
				dto.setAuthor(rs.getString("author"));
				dto.setPublisher(rs.getString("publisher"));
				dto.setRegidate(rs.getString("regidate"));
				dto.setCount(rs.getInt("count"));
				list.add(dto);
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
		return list;
	}
	// 책추가
	public int addBook(BookDTO dto) {
		int result = 0;
		String sql = "insert into book values(?, ?, ?, ?, ?)";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getAuthor());
			ps.setString(3, dto.getPublisher());
			ps.setString(4, dto.getRegidate());
			ps.setInt(5, dto.getCount());
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	// 책삭제
	public int deleteBook(BookDTO dto) {
		int result = 0;
		String sql = "delete from book where name=?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getName());
			
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return result;
	}
	// 책정보 불러오기
	public BookDTO getBook(String bookName) {
		BookDTO dto = null;
		String sql = "select * from book where name=?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, bookName);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				dto = new BookDTO();
				dto.setName(rs.getString("name"));
				dto.setAuthor(rs.getString("author"));
				dto.setPublisher(rs.getString("publisher"));
				dto.setRegidate(rs.getString("regidate"));
				dto.setCount(rs.getInt("count"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	} 
	// 책정보 수정
	public int modifyBook(String bookName, BookDTO dto) {
		int result = 0;
		String sql = "update book set "
				+ "name=?, author=?, publisher=?, regidate=?, count=? "
				+ "where name=?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getAuthor());
			ps.setString(3, dto.getPublisher());
			ps.setString(4, dto.getRegidate());
			ps.setInt(5, dto.getCount());
			ps.setString(6, bookName);
			
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
}
















