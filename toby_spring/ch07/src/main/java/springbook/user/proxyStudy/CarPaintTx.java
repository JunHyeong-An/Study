package springbook.user.proxyStudy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class CarPaintTx implements InvocationHandler {
	Object target;
	PlatformTransactionManager transactionManager;
	String pattern;
	
	public void setTarget(Object target) {
		this.target = target;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().startsWith(pattern)) 
			return invokeInTransaction(method, args);
		
		else
			return method.invoke(target, args);
	}
	
	private Object invokeInTransaction(Method method, Object[] args) throws Throwable {
		TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());
		
		try {
			Object ret = method.invoke(target, args);
			transactionManager.commit(status);
			return ret;
		} catch (InvocationTargetException e) {
			transactionManager.rollback(status);
			throw e.getTargetException();
		}
	}
}
