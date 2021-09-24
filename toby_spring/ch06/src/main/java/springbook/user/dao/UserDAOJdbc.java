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
		String sql = "insert into users(id, name, pw, email, level, login, recommand) values (?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, 
				user.getId(), user.getName(), user.getPw(), user.getEmail(), user.getLevel(), user.getLogin(), user.getRecommand());
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
	
	@Override
	public void update(User user) {
		String sql = "update users set pw = ?, name = ?, email = ?, level = ?, login = ?, recommand = ?, email = ? where id = ?";
		jdbcTemplate.update(sql,
				user.getPw(), user.getName(), user.getEmail(), user.getLevel(), user.getLogin(), user.getRecommand(), user.getEmail(), user.getId());
	}
}
