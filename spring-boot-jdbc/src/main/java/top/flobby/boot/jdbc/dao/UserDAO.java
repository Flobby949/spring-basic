package top.flobby.boot.jdbc.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import top.flobby.boot.jdbc.entity.User;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/18
 * @description :
 */
@Repository
public class UserDAO {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public User postUser(User user) {
        String sql = "INSERT INTO USER (ID, USERNAME, AGE) VALUES (?, ? ,?) ";
        Object[] args = {user.getId(), user.getUsername(), user.getAge()};
        jdbcTemplate.update(sql, args);
        return user;
    }

    public List<User> selectAll() {
        String sql = "SELECT * FROM USER ";
        List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        return userList;
    }
}
