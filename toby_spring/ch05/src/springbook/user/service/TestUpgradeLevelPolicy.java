package springbook.user.service;

import springbook.user.dao.UserDAO;
import springbook.user.domain.User;
import springbook.user.test.TestUserException;

public class TestUpgradeLevelPolicy implements UserUpgradeLevelPolicy {
	private UserDAO userDAO;
	private String id;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public TestUpgradeLevelPolicy(String id) {
		this.id = id;
	}

	public TestUpgradeLevelPolicy() {}

	@Override
	public void upgradeLevel(User user) {
		if(user.getId().equals(id))
			throw new TestUserException();
		user.upgradeLevel();
		userDAO.update(user);
	}
	
	@Override
	public boolean canUpgradeLevel(User user) {
		switch (user.getLevel()) {
		case 1:
			return (user.getLogin() >= UserService.MIN_LOGCOUNT_FOR_SILVER);
		case 2:
			return (user.getRecommand() >= UserService.MIN_RECCOMNED_FOR_GOLD);
		case 3:
			return false;

		default: 
			throw new IllegalArgumentException("UnkwonLevel : " + user.getLevel());
		}
	}
	
}
