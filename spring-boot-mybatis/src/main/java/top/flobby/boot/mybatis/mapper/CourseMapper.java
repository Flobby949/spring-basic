package top.flobby.boot.mybatis.mapper;

import top.flobby.boot.mybatis.entity.Course;

/**
 * @author Flobby
 */
public interface CourseMapper {
    Course getStudent(int courseId);
}