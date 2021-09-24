package springbook.user.domain;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

public class CountingConnectionMaker implements ConnectionMaker {	
	int cnt = 0;
//	ConnectionMaker connectionMaker;
	
//	public void setConnectionMaker(ConnectionMaker connectionMaker) {
//		this.connectionMaker = connectionMaker;
//	}
	
	DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public Connection getConnection() throws SQLException {
		cnt++;
		return dataSource.getConnection();
	}

	public int getCnt() {
		return cnt;
	}	
}
