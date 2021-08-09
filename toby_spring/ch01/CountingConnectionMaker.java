package springbook.user.domain;

import java.sql.Connection;
import java.sql.SQLException;

public class CountingConnectionMaker implements ConnectionMaker {	
	int cnt = 0;
	ConnectionMaker connectionMaker;
	
	public void setConnectionMaker(ConnectionMaker connectionMaker) {
		this.connectionMaker = connectionMaker;
	}

	@Override
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		cnt++;
		return connectionMaker.getConnection();
	}

	public int getCnt() {
		return cnt;
	}	
}
