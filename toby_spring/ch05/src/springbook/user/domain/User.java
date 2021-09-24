package springbook.user.domain;

public class User {
	private String id, pw, name, email;
	private int level, login, recommand;

	public User(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public User(String id, String pw, String name, int level, int login, int recommand) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.level = level;
		this.login = login;
		this.recommand = recommand;
	}

	public void upgradeLevel() {
		int nextLevel = Level.valueOf(level).getNext();
		if(nextLevel == 0) 
			throw new IllegalStateException(Level.valueOf(level) + "은 더 이상 업그레이드가 불가능합니다.");
		else this.level = nextLevel;
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

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLogin() {
		return login;
	}

	public void setLogin(int login) {
		this.login = login;
	}

	public int getRecommand() {
		return recommand;
	}

	public void setRecommand(int recommand) {
		this.recommand = recommand;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return this.name + "'s id : " + this.id + ", pw : " + this.pw
				+ ", level : " + this.level +", login : " + this.login +", recommand : " + this.recommand;
	}
}
