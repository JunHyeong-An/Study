package boardInterFace;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import board.BoardDTO;

public interface BoardDAO {
	// 글 쓰기(사진x)
	public boolean insertContent(String writer, String content);
	// 글 쓰기(사진o)
	public boolean insertContent(HttpServletRequest request);
	// 글 수정
	public boolean modifyContent(HttpServletRequest request);
	// 글 삭제
	public boolean deleteContent(int idx);
	// 글 전체 목록 불러오기
	public List<BoardDTO> selectContentList();
	// 글 하나 불러오기
	public BoardDTO selectContent(int idx);
}
