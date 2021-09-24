package day03;

public class Member2 {
	String id, pw, name;

	// constructor overloading
	public Member2() {}
	public Member2(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	// method overriding
	@Override
	public String toString() {
		return this.id + ", " + this.pw;
	}
	
	// getter/setters
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
	
	
	
}
