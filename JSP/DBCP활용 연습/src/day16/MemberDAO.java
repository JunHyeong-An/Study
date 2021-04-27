package day16;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MemberDAO {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	Context init;
	DataSource ds;
	
	public MemberDAO() {
		try {
			init = (Context)new InitialContext();
			ds = (DataSource)init.lookup("java:comp/env/jdbc/oracle");
		} catch (NamingException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<MemberDTO> selectList() {
		List<MemberDTO> list = null;
		String sql = "select * from member";
		
		try {
			list = new ArrayList<MemberDTO>();
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				
				dto.setIdx(rs.getInt("idx"));
				dto.setUserId(rs.getString("userid"));
				dto.setUserPw(rs.getString("userpw"));
				dto.setUserName(rs.getString("username"));
				dto.setAge(rs.getInt("age"));
				dto.setGender(rs.getString("gender"));
				dto.setRegidtDate(rs.getDate("regidtdate"));
				
				list.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}

	public boolean insertMember(MemberDTO dto) {
		boolean isJoin = false;
		int result = 0;
		String sql = "insert into member values(member_seq.nextval, ?, ?, ?, ?, ?, sysdate)";
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, dto.getUserId());
			ps.setString(2, dto.getUserPw());
			ps.setString(3, dto.getUserName());
			ps.setInt(4, dto.getAge());
			ps.setString(5, dto.getGender());
			
			result = ps.executeUpdate();
			
			if(result != 0) isJoin = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return isJoin;
	}

	public MemberDTO loginMember(MemberDTO inputDTO) {
		MemberDTO dto = null;
		String sql = "select * from member where userid = ? and userPw = ?";
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, inputDTO.getUserId());
			ps.setString(2, inputDTO.getUserPw());
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				dto = new MemberDTO();
				
				dto.setIdx(rs.getInt("idx"));
				dto.setUserId(rs.getString("userid"));
				dto.setUserPw(rs.getString("userpw"));
				dto.setUserName(rs.getString("username"));
				dto.setAge(rs.getInt("age"));
				dto.setGender(rs.getString("gender"));
				dto.setRegidtDate(rs.getDate("regidtdate"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dto;
	}

	public boolean updateMember(MemberDTO inputDTO) {
		boolean isUpdate = false;
		int result = 0;
		String sql = "update member set age = ?, gender = ? where userid = ?";
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, inputDTO.getAge());
			ps.setString(2, inputDTO.getGender());
			ps.setString(3, inputDTO.getUserId());
			
			result = ps.executeUpdate();
			
			if(result != 0) isUpdate = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return isUpdate;
	}

	public boolean deleteMember(MemberDTO dto) {
		int result = 0;
		boolean isDelete = false;
		String sql = "delete member where idx = ?";
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);

			ps.setInt(1, dto.getIdx());
			
			result = ps.executeUpdate();
			
			if(result != 0) isDelete = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return isDelete;
	}
}

















