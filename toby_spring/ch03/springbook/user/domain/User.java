package springbook.user.domain;

public class User {
	private String id, pw, name;

	public User(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public User() {}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name + "'s id : " + this.id + ", pw : " + this.pw;
	}
}
