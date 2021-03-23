package top.flobby.boot.jdbc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.flobby.boot.jdbc.dao.StudentDAO;
import top.flobby.boot.jdbc.entity.Student;
import top.flobby.boot.jdbc.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/16
 * @description :
 */

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDAO studentDAO;

    @Override
    public List<Student> getStudentList() {
        return studentDAO.listStudents();
    }

    @Override
    public List<Student> getStudentById(Integer id) {
        return studentDAO.getStuById(id);
    }

    @Override
    public int deleteById(Integer id) {
        return studentDAO.deleteStudent(id);
    }

    @Override
    public int updateStu(Student student) {
        return studentDAO.updateStudent(student);
    }
}
