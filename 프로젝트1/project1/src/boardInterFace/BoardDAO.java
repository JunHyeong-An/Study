package boardInterFace;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import board.BoardDTO;

public interface BoardDAO {
	// �� ����(����x)
	public boolean insertContent(String writer, String content);
	// �� ����(����o)
	public boolean insertContent(HttpServletRequest request);
	// �� ����
	public boolean modifyContent(HttpServletRequest request);
	// �� ����
	public boolean deleteContent(int idx);
	// �� ��ü ��� �ҷ�����
	public List<BoardDTO> selectContentList();
	// �� �ϳ� �ҷ�����
	public BoardDTO selectContent(int idx);
}
