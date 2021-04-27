package day16;

import java.sql.Date;

public class MemberDTO {
//	
//	IDX        NOT NULL NUMBER        
//	USERID     NOT NULL VARCHAR2(20)  
//	USERPW     NOT NULL VARCHAR2(500) 
//	USERNAME   NOT NULL VARCHAR2(50)  
//	AGE                 NUMBER        
//	GENDER              VARCHAR2(10)  
//	REGIDTDATE          DATE   
	
	private int idx, age;
	private String userId, userPw, userName, gender;
	private Date regidtDate;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getRegidtDate() {
		return regidtDate;
	}
	public void setRegidtDate(Date regidtDate) {
		this.regidtDate = regidtDate;
	}
	
	
	
}
















