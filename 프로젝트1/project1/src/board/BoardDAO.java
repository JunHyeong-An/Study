package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import fileupload.PostFileUploader;

public class BoardDAO implements boardInterFace.BoardDAO {
	private static BoardDAO instance; 
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private Context init;
	private DataSource ds;
	
	private BoardDAO() {
		try {
			init = (Context)new InitialContext();
			ds = (DataSource)init.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
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
	
	public static BoardDAO getInstance() {
		if(instance == null) {
			instance = new BoardDAO();
		}
		return instance;
	}
	
	@Override
	public boolean insertContent(String writer, String content) {
		String sql = "insert into board (writer, content) values(?, ?)";
		int result = 0;
		boolean isInsertContent = false;
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, writer);
			ps.setString(2, content);
			
			result = ps.executeUpdate();
			if(result != 0) isInsertContent = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return isInsertContent;
	}
	
	@Override
	public boolean insertContent(HttpServletRequest request) {
		PostFileUploader uploader = new PostFileUploader(request);
		String sql = "insert into board (writer, content, img) values(?, ?, ?)";
		int result = 0;
		boolean isInsert = false;
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, uploader.getWriter());
			ps.setString(2, uploader.getContent());
			ps.setString(3, uploader.getImg());
			
			result = ps.executeUpdate();
			if(result != 0) isInsert = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return isInsert;
	}
	
	@Override
	public BoardDTO selectContent(int idx) {
		String sql = "select * from board where idx = ?";
		BoardDTO dto = null;
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, idx);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				dto = new BoardDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setWriter(rs.getString("writer"));
				dto.setContent(rs.getString("content"));
				dto.setImg(rs.getString("img"));
				dto.setWriteDate(rs.getString("writedate"));
				dto.setDeleted(rs.getString("deleted"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return dto;
	}
	
	@Override
	public boolean modifyContent(HttpServletRequest request) {
		PostFileUploader uploader = new PostFileUploader(request);
		String sql = "update board set content = ?, img = ? where idx = ?";
		int result = 0;
		boolean isModify = false;
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, uploader.getContent());
			ps.setString(2, uploader.getImg());
			ps.setInt(3, uploader.getIdx());
			
			result = ps.executeUpdate();
			if(result != 0) isModify = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return isModify;
	}

	@Override
	public boolean deleteContent(int idx) {
		String sql = "update board set deleted = 'y' where idx = ?";
		int result = 0;
		boolean isDelete = false;
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, idx);
			
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
	public List<BoardDTO> selectContentList() {
		String sql = "select * from board where deleted='n' order by writedate desc";
		List<BoardDTO> list = null;
		
		try {
			list = new ArrayList<BoardDTO>();
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				BoardDTO dto = new BoardDTO();
				
				dto.setIdx(rs.getInt("idx"));
				dto.setWriter(rs.getString("writer"));
				dto.setContent(rs.getString("content"));
				dto.setImg(rs.getString("img"));
				dto.setWriteDate(rs.getString("writedate"));
				dto.setDeleted(rs.getString("deleted"));
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return list;
	}
}
