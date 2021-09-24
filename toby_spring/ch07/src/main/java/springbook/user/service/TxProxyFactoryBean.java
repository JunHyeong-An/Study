package springbook.user.service;

import java.lang.reflect.Proxy;

import org.springframework.beans.factory.FactoryBean;

public class TxProxyFactoryBean implements FactoryBean<Object> {
	private TransactionHandler txHandler;
	private Class<?> serviceInterface;
	
	public void setTxHandler(TransactionHandler txHandler) {
		this.txHandler = txHandler;
	}

	public void setServiceInterface(Class<?> serviceInterface) {
		this.serviceInterface = serviceInterface;
	}

	@Override
	public Object getObject() throws Exception {
		return Proxy.newProxyInstance(getClass().getClassLoader(), new Class[] {serviceInterface}, txHandler);
	}
	
	@Override
	public Class<?> getObjectType() {
		return serviceInterface;
	}
	
	@Override
	public boolean isSingleton() {
		return false;
	}
}
