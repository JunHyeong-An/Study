package springbook.user.service;

import java.util.List;

import springbook.user.dao.UserDAO;
import springbook.user.domain.User;

public class UserServiceImpl implements UserService {
	public static final int MIN_LOGCOUNT_FOR_SILVER = 50;
	public static final int MIN_RECCOMNED_FOR_GOLD = 30;

	UserUpgradeLevelPolicy uulp;
	UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void setUulp(UserUpgradeLevelPolicy uulp) {
		this.uulp = uulp;
	}

	@Override
	public void add(User user) {
		if(user.getLevel() == 0) user.setLevel(1);
		userDAO.add(user);
	}

	@Override
	public void deleteAll() {
		userDAO.deleteAll();
	}

	@Override
	public User get(String id) {
		return userDAO.get(id);
	}

	@Override
	public List<User> getAll() {
		return userDAO.getAll();
	}

	@Override
	public void update(User user) {
		userDAO.update(user);
	}

	@Override
	public void upgradeLevels() {
		List<User> list = userDAO.getAll();

		for(User user : list) 
			if(uulp.canUpgradeLevel(user))
				uulp.upgradeLevel(user);
	}
	
	@Override
	public int getCount() {
		return userDAO.getCount();
	}	
}
