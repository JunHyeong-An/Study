package comment;

public class CommentDTO {
	private String writer, content, writeDate;
	private int idx, contentIdx;

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getContentIdx() {
		return contentIdx;
	}

	public void setContentIdx(int contentIdx) {
		this.contentIdx = contentIdx;
	}
	
	
}
