package springbook.user.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mysql.cj.exceptions.MysqlErrorNumbers;

import springbook.user.domain.User;
import springbook.user.exception.DuplicateUserIdException;
import springbook.user.sqlService.SqlService;

public class UserDAOJdbc implements UserDAO {
	private JdbcTemplate jdbcTemplate;
	
	private SqlService sqlService;

	public void setSqlService(SqlService sqlService) {
		this.sqlService = sqlService;
	}

	RowMapper<User> rowMapper = new RowMapper<User>() {
		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setId(rs.getString("id"));
			user.setPw(rs.getString("pw"));
			user.setName(rs.getString("name"));
			user.setEmail(rs.getString("email"));
			user.setLevel(rs.getInt("level"));
			user.setLogin(rs.getInt("login"));
			user.setRecommand(rs.getInt("recommand"));
			user.setEmail(rs.getString("email"));
			return user;
		}
	};
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void add(User user) {
		jdbcTemplate.update(this.sqlService.getSql("userAdd"), 
				user.getId(), user.getName(), user.getPw(), user.getEmail(), user.getLevel(), user.getLogin(), user.getRecommand());
	}
	
	public void deleteAll() {
		jdbcTemplate.update(this.sqlService.getSql("userDeleteAll"));
	}
	
	public User get(String id) {
		User user = null;
		
		user = jdbcTemplate.queryForObject(this.sqlService.getSql("userGet"), new Object[] {id}, rowMapper);
		return user;
	}
	
	public int getCount() {
		return jdbcTemplate.queryForInt(this.sqlService.getSql("userGetCount"));
	}
	
	public List<User> getAll() {
		List<User> list = null;
		
		list = jdbcTemplate.query(this.sqlService.getSql("userGetAll"), rowMapper);
		
		return list;
	}
	
	@Override
	public void update(User user) {
		jdbcTemplate.update(this.sqlService.getSql("userUpdate"),
				user.getPw(), user.getName(), user.getEmail(), user.getLevel(), user.getLogin(), user.getRecommand(), user.getEmail(), user.getId());
	}
}
