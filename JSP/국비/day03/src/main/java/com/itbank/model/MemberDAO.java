package com.itbank.model;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

@Repository
public class MemberDAO {
	@Autowired
	private JdbcTemplate jt;
	
	public List<MemberDTO> selectUsers() {
		String sql = "select * from member2 order by USERID";
		
		RowMapper<MemberDTO> rowMapper = (ResultSet rs, int row) -> {
			MemberDTO dto = new MemberDTO();
			dto.setIdx(rs.getInt("IDX"));
			dto.setUserId(rs.getString("USERID"));
			dto.setUserPw(rs.getString("USERPW"));
			dto.setUserName(rs.getString("USERNAME"));
			dto.setPhone(rs.getString("PHONE"));
			dto.setBirth(rs.getString("BIRTH"));
			return dto;
		};
		
		return jt.query(sql, rowMapper);
	}
	
	public MemberDTO selectUser(int idx) {
		String sql = "select * from member2 where idx = ?";
		
		RowMapper<MemberDTO> rowMapper = (ResultSet rs, int row) -> {
			MemberDTO dto = new MemberDTO();
			dto.setIdx(rs.getInt("IDX"));
			dto.setUserId(rs.getString("USERID"));
			dto.setUserPw(rs.getString("USERPW"));
			dto.setUserName(rs.getString("USERNAME"));
			dto.setPhone(rs.getString("PHONE"));
			dto.setBirth(rs.getString("BIRTH"));
			return dto;
		};
		
		return jt.queryForObject(sql, rowMapper, idx);
	}
	
	public MemberDTO login(String userId, String userPw) {
		String sql = "select * from member2 where userid = ? and userpw = ?";
		
		RowMapper<MemberDTO> rowmapper = (ResultSet rs, int row) -> {
			MemberDTO dto = new MemberDTO();
			dto.setIdx(rs.getInt("IDX"));
			dto.setUserId(rs.getString("USERID"));
			dto.setUserPw(rs.getString("USERPW"));
			dto.setUserName(rs.getString("USERNAME"));
			dto.setPhone(rs.getString("PHONE"));
			dto.setBirth(rs.getString("BIRTH"));
			return dto;
		};
		
		return jt.queryForObject(sql, rowmapper, userId, userPw);
	}
	
	public boolean modify(MemberDTO dto) {
		String sql = "update member2 set userid = ?, username = ?, phone = ?, birth = ? where idx = ?";
		boolean isUpdate = false;
		int result = 0;
		
		result = jt.update(sql, dto.getUserId(), dto.getUserName(), dto.getPhone(), dto.getBirth(), dto.getIdx());
		if(result != 0) isUpdate = true;
		
		return isUpdate;
	}
	
	public boolean join(MemberDTO dto) {
		String sql = "insert into member2 values (member2_seq.nextval, ?, ?, ?, ?, ?)";
		int result = 0;
		boolean isJoin = false;
		
		result = jt.update(sql, dto.getUserId(), dto.getUserPw(), dto.getUserName(), dto.getPhone(), dto.getBirth());
		
		if(result != 0) isJoin = true;
		
		return isJoin;
	}
	
}
