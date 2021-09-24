package commentInterFace;

import java.util.List;

import comment.CommentDTO;

public interface CommentDAO {
	// ´ñ±Û ¸ñ·Ï ºÒ·¯¿À±â
	public List<CommentDTO> getCommentList(int contentInx);
	// ´ñ±Û ÀÛ¼º
	public boolean insertComment(CommentDTO dto);
	// ´ñ±Û »èÁ¦
	public boolean deleteComment(int idx);
}
