package top.flobby.boot.mybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.flobby.boot.mybatis.controller.dto.AjaxResponse;
import top.flobby.boot.mybatis.entity.Course;
import top.flobby.boot.mybatis.mapper.CourseMapper;

import javax.annotation.Resource;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/25
 * @description :
 */
@RestController
@RequestMapping(value = "api/course")
public class CourseController {
    @Resource
    private CourseMapper courseMapper;

    @GetMapping("{courseId}")
    public AjaxResponse getStudent(@PathVariable int courseId) {
        Course course = courseMapper.getStudent(courseId);
        return AjaxResponse.success(course);
    }
}
