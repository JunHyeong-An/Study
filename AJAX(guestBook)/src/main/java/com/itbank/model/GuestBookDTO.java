package com.itbank.model;

public class GuestBookDTO {
//	IDX     NOT NULL NUMBER         
//	WRITER  NOT NULL VARCHAR2(50)   
//	CONTENT NOT NULL VARCHAR2(1000) 
	
	private int idx;
	private String writer, content, writeDate;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
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
}
