package top.flobby.boot.jdbc.service;


import top.flobby.boot.jdbc.entity.Student;

import java.util.List;

/**
 * @author Flobby
 */

public interface StudentService {
    /**
     * 查询所有
     *
     * @return list
     */
    List<Student> getStudentList();

    /**
     * 根据id查询
     *
     * @param id id
     * @return list
     */
    List<Student> getStudentById(Integer id);

    /**
     * 根据id删除
     *
     * @param id id
     * @return int
     */
    int deleteById(Integer id);

    /**
     * 根据id删除
     *
     * @param student id
     * @return int
     */
    int updateStu(Student student);
}
