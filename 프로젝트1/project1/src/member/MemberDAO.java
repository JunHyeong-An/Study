package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import fileupload.MyInfoFileUploader;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServletRequest;

public class MemberDAO implements memberInterFace.MemberDAO {
	private static MemberDAO instance;
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private Context init;
	private DataSource ds;
	
	private MemberDAO() {
		try {
			init = (Context)new InitialContext();
			ds = (DataSource)init.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(con != null) con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static MemberDAO getInstance() {
		if(instance == null) {
			instance = new MemberDAO();
		}
		return instance;
	}

	@Override
	public boolean join(MemberDTO dto) {
		String sql = "insert into member(id, pw, name, age, email, birth) values(?, ?, ?, ?, ?, ?)";
		int result = 0;
		boolean isJoin = false;
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getName());
			ps.setInt(4, dto.getAge());
			ps.setString(5, dto.getEmail());
			ps.setString(6, dto.getBirth());
			
			result = ps.executeUpdate();
			
			if(result != 0) isJoin = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return isJoin;
	}

	@Override
	public MemberDTO login(String id, String pw) {
		String sql = "select * from member where id = ? and pw = ? and deleted = 'n'";
		MemberDTO dto = null;
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				dto = new MemberDTO();
				
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setEmail(rs.getString("email"));
				dto.setBirth(rs.getString("birth"));
				dto.setProfilePic(rs.getString("profilepic"));
				dto.setIntroduction(rs.getString("introduction"));
				dto.setRegiDate(rs.getDate("regidate"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return dto;
	}

	@Override
	public boolean update(HttpServletRequest request, String id) {
		String sql = "update member set age = ?, name = ?, email = ?, introduction = ?, profilepic = ? where id = ?";
		MyInfoFileUploader uploader = new MyInfoFileUploader(request);
		int result = 0;
		boolean isUpdate = false;
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, uploader.getAge());
			ps.setString(2, uploader.getName());
			ps.setString(3, uploader.getEmail());
			ps.setString(4, uploader.getIntroduction());
			ps.setString(5, uploader.getProfilePic());
			ps.setString(6, id);
			
			result = ps.executeUpdate();
			if(result != 0) isUpdate = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return isUpdate;
	}

	@Override
	public boolean secession(String id, String pw) {
		String sql = "update member set deleted = 'y' where id = ? and pw = ?";
		int result = 0;
		boolean isDelete = false;
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			
			result = ps.executeUpdate();
			if(result != 0) isDelete = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return isDelete;
	}
  
	@Override
	public MemberDTO getInfo(String id) {
		String sql = "select id, name, age, email, birth, profilepic, introduction from member where id = ?";
		MemberDTO dto = null;
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				dto = new MemberDTO();
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setEmail(rs.getString("email"));
				dto.setBirth(rs.getString("birth"));
				dto.setProfilePic(rs.getString("profilepic"));
				dto.setIntroduction(rs.getString("introduction"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return dto;
	}

	@Override
	public List<MemberDTO> searchMember(String searchValue) {
		String sql = "select id, name, profilePic, introduction from member "
				+ "where id like ? or name like ?";
		List<MemberDTO> list = null;
		
		try {
			list = new ArrayList<MemberDTO>();
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, "%" + searchValue + "%");
			ps.setString(2, "%" + searchValue + "%");
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setName(rs.getString("name"));
				dto.setId(rs.getString("id"));
				dto.setProfilePic(rs.getString("profilepic"));
				dto.setIntroduction(rs.getString("introduction"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
	
	@Override
	public List<MemberDTO> getMemberList() {
		List<MemberDTO> list = null;
		String sql = "select id, name, profilePic from member where deleted = 'n' order by id";
		
		try {
			list = new ArrayList<MemberDTO>();
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setName(rs.getString("name"));
				dto.setId(rs.getString("id"));
				dto.setProfilePic(rs.getString("profilepic"));
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
	
	public boolean changePassword(String id, String pw, String newPw) {
		String sql = "update member set pw = ? where id = ? and pw = ?";
		int result = 0;
		boolean isPwChange = false;
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, newPw);
			ps.setString(2, id);
			ps.setString(3, pw);
			
			result = ps.executeUpdate();
			
			if(result != 0) isPwChange = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return isPwChange;
	}
	
	@Override
	public String getUserProfilPic(String id) {
		String sql = "select profilepic from member where id = ?";
		String fileName = "";
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				fileName = rs.getString("profilepic");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return fileName;
	}
	
	@Override
	public String getUserName(String id) {
		String sql = "select name from member where id = ?";
		String name = "";
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			
			rs = ps.executeQuery();
			
			if(rs.next()) name = rs.getString("name");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return name;
	}
}












