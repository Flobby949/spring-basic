package top.flobby.boot.mybatis.mapper;

import top.flobby.boot.mybatis.entity.Course;

/**
 * @author Flobby
 */
public interface CourseMapper {
    /**
     * 获取选择该课程的所有学生（一对多）
     *
     * @param courseId 课程id
     * @return 课程对象
     */
    Course getStudent(int courseId);
}