package top.flobby.boot.jdbc.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import top.flobby.boot.jdbc.controller.dto.AjaxResponse;
import top.flobby.boot.jdbc.entity.Student;
import top.flobby.boot.jdbc.service.StudentService;

import javax.annotation.Resource;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/16
 * @description :
 */

@RestController
@RequestMapping(value = "api/students")
@Slf4j
@Api(tags = "学生管理接口")
public class StudentController {
    @Resource
    private StudentService studentService;

    @GetMapping("all")
    @ApiOperation("获取所有学生信息列表")
    public AjaxResponse getStuList(){
        return AjaxResponse.success(studentService.getStudentList(), "查询成功");
    }

    @GetMapping()
    @ApiOperation("获取指定编号学生信息")
    public AjaxResponse getById(
            @ApiParam("待查询学生编号")
            @RequestParam int id) {
        return AjaxResponse.success(studentService.getStudentById(id), "查询成功");
    }

    @DeleteMapping()
    @ApiOperation("删除学生")
    public AjaxResponse deleteById(
            @ApiParam("待删除学生编号")
            @RequestParam int id) {
        return AjaxResponse.success(studentService.deleteById(id), "删除成功");
    }

    @PutMapping()
    @ApiOperation("修改学生信息")
    public AjaxResponse updateStu(@RequestBody Student student) {
        return AjaxResponse.success(studentService.updateStu(student), "修改成功");
    }
}
