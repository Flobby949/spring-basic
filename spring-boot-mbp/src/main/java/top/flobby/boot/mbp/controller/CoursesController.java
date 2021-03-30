package top.flobby.boot.mbp.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.flobby.boot.mbp.domain.Courses;
import top.flobby.boot.mbp.service.CoursesService;

import javax.annotation.Resource;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/30
 * @description :
 */
@RestController
@RequestMapping("api/mbp")
public class CoursesController {
    @Resource
    private CoursesService coursesService;

    @PostMapping("page")
    public PageInfo<Courses> getByPage(@RequestParam(name = "pageNum", defaultValue = "1", required = false) int pageNum,
                                       @RequestParam(name = "pageSize", defaultValue = "10", required = false) int pageSize)
    {
        return coursesService.findByPage(pageNum, pageSize);
    }
}
