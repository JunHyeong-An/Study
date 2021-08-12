package springbook.user.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mysql.cj.exceptions.MysqlErrorNumbers;

import springbook.user.domain.User;
import springbook.user.exception.DuplicateUserIdException;

public class UserDAOJdbc implements UserDAO {
	private JdbcTemplate jdbcTemplate;
	
	RowMapper<User> rowMapper = new RowMapper<User>() {
		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setId(rs.getString("id"));
			user.setPw(rs.getString("pw"));
			user.setName(rs.getString("name"));
			return user;
		}
	};
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void add(User user) {
		String sql = "insert into users(id, name, pw) values (?, ?, ?)";
		jdbcTemplate.update(sql, user.getId(), user.getName(), user.getPw());
	}
	
	public void deleteAll() {
		String sql = "truncate users";
		jdbcTemplate.update(sql);
	}
	
	public User get(String id) {
		String sql = "select * from users where id = ? order by id";
		User user = null;
		
		user = jdbcTemplate.queryForObject(sql, new Object[] {id}, rowMapper);
		
		return user;
	}
	
	public int getCount() {
		String sql = "select count(*) from users";
		return jdbcTemplate.queryForInt(sql);
	}
	
	public List<User> getAll() {
		String sql = "select * from users order by id";
		List<User> list = null;
		
		list = jdbcTemplate.query(sql, rowMapper);
		
		return list;
	}
}
