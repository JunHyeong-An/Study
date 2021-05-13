package comment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class CommentDAO implements commentInterFace.CommentDAO {
	private static CommentDAO instance; 
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private Context init;
	private DataSource ds;
	
	private CommentDAO() {
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
	
	public static CommentDAO getInstance() {
		if(instance == null) {
			instance = new CommentDAO();
		}
		return instance;
	}

	@Override
	public List<CommentDTO> getCommentList(int contentInx) {
		String sql = "select * from commentTable where contentidx = ? and deleted = 'n'";
		List<CommentDTO> list = null;
		
		try {
			list = new ArrayList<CommentDTO>();
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, contentInx);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				CommentDTO dto = new CommentDTO();
				dto.setWriter(rs.getString("writer"));
				dto.setContent(rs.getString("content"));
				dto.setWriteDate(rs.getString("writedate"));
				dto.setIdx(rs.getInt("idx"));
				dto.setContentIdx(rs.getInt("contentIdx"));
				
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
	public boolean insertComment(CommentDTO dto) {
		String sql = "insert into commentTable (contentIdx, writer, content) values(?, ?, ?)";
		int result = 0;
		boolean isInsert = false;
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, dto.getContentIdx());
			ps.setString(2, dto.getWriter());
			ps.setString(3, dto.getContent());

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
	public boolean deleteComment(int idx) {
		String sql = "update commentTable set deleted = 'y' where idx = ?";
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

}
