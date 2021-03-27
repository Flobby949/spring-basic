package top.flobby.boot.mybatis.mapper;

import top.flobby.boot.mybatis.entity.Teacher;

import java.util.List;

/**
 * @author Flobby
 */
public interface TeacherMapper {
    /**
     * 查询老师和管理的班级（一对一）
     *
     * @param teacherId 老师id
     * @return teacher对象
     */
    Teacher getTeacherOneByOne(int teacherId);
}