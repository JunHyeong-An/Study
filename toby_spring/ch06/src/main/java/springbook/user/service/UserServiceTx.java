package springbook.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import springbook.user.domain.User;

public class UserServiceTx implements UserService {
	private UserService userService;
	private PlatformTransactionManager transactionManager;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	@Override
	public void add(User user) {
		userService.add(user);			
	}
	
	@Override
	public void upgradeLevels() {
		TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());
		
		try {
			userService.upgradeLevels();			
			transactionManager.commit(status);
		} catch (RuntimeException e) {
			transactionManager.rollback(status);
			throw e;
		}
	}
	
	@Override
	public void deleteAll() {
		userService.deleteAll();
	}

	@Override
	public User get(String id) {
		return userService.get(id);
	}

	@Override
	public int getCount() {
		return userService.getCount();
	}

	@Override
	public List<User> getAll() {
		return userService.getAll();
	}

	@Override
	public void update(User user) {
		userService.update(user);
	}
}
