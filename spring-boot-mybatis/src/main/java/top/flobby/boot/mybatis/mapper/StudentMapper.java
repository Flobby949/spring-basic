package top.flobby.boot.mybatis.mapper;

import top.flobby.boot.mybatis.entity.Student;

/**
 * @author Flobby
 */
public interface StudentMapper {
    int deleteByPrimaryKey(Integer studentId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer studentId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}