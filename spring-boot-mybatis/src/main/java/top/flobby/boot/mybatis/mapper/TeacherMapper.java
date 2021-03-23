package top.flobby.boot.mybatis.mapper;

import org.apache.ibatis.annotations.Select;
import top.flobby.boot.mybatis.entity.Teacher;

import java.util.List;

/**
 * @author Flobby
 */
public interface TeacherMapper {
    /**
     * 返回所有teacher, 用注解实现
     * @return
     */
    @Select("SELECT * FROM t_teacher")
    List<Teacher> selectAll();


    /**
     * 返回所有teacher, 用xml文件
     * @return
     */
    List<Teacher> findAll();

    int insertTeacher(Teacher teacher);

//    int deleteByPrimaryKey(Integer teacherId);
//
//    int insert(Teacher record);
//
//    int insertSelective(Teacher record);
//
//    Teacher selectByPrimaryKey(Integer teacherId);
//
//    int updateByPrimaryKeySelective(Teacher record);
//
//    int updateByPrimaryKey(Teacher record);
}