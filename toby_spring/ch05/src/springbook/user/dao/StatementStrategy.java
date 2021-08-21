package springbook.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public interface StatementStrategy {
	PreparedStatement makePreparedStatement(Connection con);
}
