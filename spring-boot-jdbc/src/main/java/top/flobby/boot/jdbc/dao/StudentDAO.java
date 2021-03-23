package top.flobby.boot.jdbc.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import top.flobby.boot.jdbc.entity.Student;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/16
 * @description :
 */
@Repository
public class StudentDAO {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public List<Student> listStudents() {
        String sql = "SELECT * FROM t_student WHERE deleted = 0";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
    }

    public List<Student> getStuById(Integer id) {
        String sql = "SELECT * FROM t_student WHERE id = ? and deleted = 0";
        return jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Student.class));
    }

    public int updateStudent(Student student) {
        String sql = "UPDATE t_student SET nickname = ?, hometown = ?, mobile = ? WHERE id = ? ";
        Object[] args = {student.getNickname(), student.getHometown(), student.getMobile(), student.getId()};
        return jdbcTemplate.update(sql, args);
    }

    public int deleteStudent(Integer id) {
        String sql = "UPDATE t_student SET deleted = 1  WHERE id = ? ";
        return jdbcTemplate.update(sql,id);
    }
}
