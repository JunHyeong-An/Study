package springbook.user.dao;

import java.util.ArrayList;
import java.util.List;

import springbook.user.domain.User;

public class MockUserDAO implements UserDAO {
	private List<User> users = new ArrayList<User>();
	private List<User> updated = new ArrayList<User>();
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<User> getUpdated() {
		return updated;
	}

	public void setUpdated(List<User> updated) {
		this.updated = updated;
	}

	@Override
	public void add(User user) {
		this.users.add(user);
	}

	@Override
	public void deleteAll() {
		throw new UnsupportedOperationException();
	}

	@Override
	public User get(String id) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getCount() {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public void update(User user) {
		this.users.add(user);
	}
	
}
