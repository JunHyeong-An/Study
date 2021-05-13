package memberInterFace;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import member.MemberDTO;

public interface MemberDAO {	
	// 회원가입
	public boolean join(MemberDTO dto);
	
	// 로그인
	public MemberDTO login(String id, String pw);
	
	// 회원 정보 수정
	public boolean update(HttpServletRequest request, String id);
	
	// 회원 탈퇴 
	public boolean secession(String id, String pw);
	
	// 회원 정보 가져오기
	public MemberDTO getInfo(String id);
	
	// 회원 검색 (이름 혹은 아이디)
	public List<MemberDTO> searchMember(String searchValue);
	
	// 회원 목록 가져오기
	public List<MemberDTO> getMemberList();
	
	// 비밀번호 변경
	public boolean changePassword(String id, String pw, String newPw);
	
	// 유저 프로필 사진 불러오기
	public String getUserProfilPic(String id);
	
	// 유저 이름 불러오기
	public String getUserName(String id);
}
