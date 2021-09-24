package memberInterFace;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import member.MemberDTO;

public interface MemberDAO {	
	// ȸ������
	public boolean join(MemberDTO dto);
	
	// �α���
	public MemberDTO login(String id, String pw);
	
	// ȸ�� ���� ����
	public boolean update(HttpServletRequest request, String id);
	
	// ȸ�� Ż�� 
	public boolean secession(String id, String pw);
	
	// ȸ�� ���� ��������
	public MemberDTO getInfo(String id);
	
	// ȸ�� �˻� (�̸� Ȥ�� ���̵�)
	public List<MemberDTO> searchMember(String searchValue);
	
	// ȸ�� ��� ��������
	public List<MemberDTO> getMemberList();
	
	// ��й�ȣ ����
	public boolean changePassword(String id, String pw, String newPw);
	
	// ���� ������ ���� �ҷ�����
	public String getUserProfilPic(String id);
	
	// ���� �̸� �ҷ�����
	public String getUserName(String id);
}
