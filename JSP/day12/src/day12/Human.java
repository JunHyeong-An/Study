package day12;

public class Human implements Comparable<Human>{	// ��ü������ ������ �� �ִ� ������ ���� �� �ִ�.
	private String name;
	private int age;
	
	public Human() {}
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Human o) {	// �ٸ� Human ��ü�� �񱳴������ ���޵Ǿ�����
		return this.age - o.age;	// �ڽ��� age�� �ٸ� ��ü�� age�� ���ϵ��� �Ѵ�.
	}

	@Override
	public String toString() {
		return String.format("%s : %d", name, age);
	}
	
}
