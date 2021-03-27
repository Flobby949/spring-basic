package top.flobby.boot.mybatis.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.flobby.boot.mybatis.controller.dto.AjaxResponse;
import top.flobby.boot.mybatis.entity.Student;
import top.flobby.boot.mybatis.mapper.StudentMapper;

import javax.annotation.Resource;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/25
 * @description :
 */
@RestController
@Slf4j
@RequestMapping(value = "api/student")
public class StudentController {
    @Resource
    private StudentMapper studentMapper;

    @GetMapping("{studentId}")
    public AjaxResponse getCourse(@PathVariable int studentId) {
        Student student = studentMapper.getCourse(studentId);
        return AjaxResponse.success(student);
    }
}
