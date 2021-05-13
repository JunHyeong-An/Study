package commentInterFace;

import java.util.List;

import comment.CommentDTO;

public interface CommentDAO {
	// ��� ��� �ҷ�����
	public List<CommentDTO> getCommentList(int contentInx);
	// ��� �ۼ�
	public boolean insertComment(CommentDTO dto);
	// ��� ����
	public boolean deleteComment(int idx);
}
