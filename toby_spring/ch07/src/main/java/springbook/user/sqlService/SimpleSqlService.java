package springbook.user.sqlService;

import java.util.Map;

public class SimpleSqlService implements SqlService {
	Map<String, String> sqlMap;
	
	public void setSqlMap(Map<String, String> sqlMap) {
		this.sqlMap = sqlMap;
	}

	@Override
	public String getSql(String key) throws SqlRetrievalFailureException {
		String sql = sqlMap.get(key);
		
		if(sql == null) throw new SqlRetrievalFailureException(
				"No sql by " + key);
		else
			return sql;
	}
}
