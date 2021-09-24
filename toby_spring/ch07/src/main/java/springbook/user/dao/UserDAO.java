package springbook.user.dao;

import java.util.List;

import springbook.user.domain.User;

public interface UserDAO {
	public void add(User user);
	public void deleteAll();
	public User get(String id);
	public int getCount();
	public List<User> getAll();
	public void update(User user);
}
