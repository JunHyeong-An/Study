package springbook.user.service;

import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import springbook.user.dao.UserDAO;
import springbook.user.dao.UserDAOJdbc;
import springbook.user.domain.User;

public class UserService extends UserDAOJdbc {
	public static final int MIN_LOGCOUNT_FOR_SILVER = 50;
	public static final int MIN_RECCOMNED_FOR_GOLD = 30;

	UserUpgradeLevelPolicy uulp;
	UserDAO userDAO;
	
	private PlatformTransactionManager transactionManager;
	
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

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

	public void upgradeLevels() throws Exception {
		TransactionStatus status = 
				transactionManager.getTransaction(new DefaultTransactionDefinition());
		
		try {
			List<User> list = userDAO.getAll();
			for(User user : list) {
				if(uulp.canUpgradeLevel(user))
					uulp.upgradeLevel(user);
			}
			transactionManager.commit(status);
		} catch (Exception e) {
			transactionManager.rollback(status);
			throw e;
		}
	}
//	public void upgradeLevels() throws Exception {
//		TransactionSynchronizationManager.initSynchronization();
//		Connection c = DataSourceUtils.getConnection(dataSource);
//		c.setAutoCommit(false);
//		
//		try {
//			List<User> list = userDAO.getAll();
//			for(User user : list) {
//				if(uulp.canUpgradeLevel(user))
//					uulp.upgradeLevel(user);
//			}
//			c.commit();
//		} catch (Exception e) {
//			c.rollback();
//			throw e;
//		} finally {
//			DataSourceUtils.releaseConnection(c, dataSource);
//			TransactionSynchronizationManager.unbindResource(this.dataSource);
//			TransactionSynchronizationManager.clearSynchronization();
//		}
//	}
	
	
}
