package day03;

public class Member {	
	// �ڹ� ���� : JSP���� �����ϰ� �ݺ��Ǵ� ������ �����ϰ� �ڵ�ȭ�ϱ� ���� ���� Ŭ����
	// �Ϲ������� private ����ʵ�� public getter/setter�� ������
	// �ݵ�� �⺻�����ڸ� �����ؾ� �Ѵ�.
	
	private String id, pw, name, gender;
	private int age;
	
	// �����ڸ� �ۼ����� ������ �ڹ� ���� �ӽ��� �⺻ ������(�Ű������� ���� �ʴ�)�� ������ش�.
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
}
