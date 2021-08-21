package springbook.user.domain;

public enum Level {
	BASIC(1, 2), SILVER(2, 3), GOLD(3, 0);
	private int level, next;
	
	private Level(int level, int next) {
		this.level = level;
		this.next = next;
	}
	
	public static Level valueOf(int level) {
		switch (level) {
		case 1: return BASIC;
		case 2: return SILVER;
		case 3: return GOLD;
		default: throw new AssertionError("Unknown level : " + level);
		}
	}
	
	public int getLevel() {
		return level;
	}

	public int getNext() {
		return next;
	}
}
