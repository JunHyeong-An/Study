package springbook.user.service;

import java.util.List;

import springbook.user.domain.User;

public interface UserService {
	void add(User user);
	void upgradeLevels();
	public void deleteAll();
	public User get(String id);
	public int getCount();
	public List<User> getAll();
	public void update(User user);
}



// memo

// add()
// up
// get

// 