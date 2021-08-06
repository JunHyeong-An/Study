package com.itbank.model;

public class MemberDTO {
//	IDX      NOT NULL NUMBER        
//	USERID   NOT NULL VARCHAR2(20)  
//	USERPW   NOT NULL VARCHAR2(130) 
//	USERNAME NOT NULL VARCHAR2(20)  
//	PHONE    NOT NULL VARCHAR2(60)  
//	BIRTH    NOT NULL VARCHAR2(6)
	
	private String userId, userPw, userName, phone, birth;
	private int idx;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	
}
