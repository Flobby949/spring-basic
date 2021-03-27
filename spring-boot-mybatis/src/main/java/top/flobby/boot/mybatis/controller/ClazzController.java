package top.flobby.boot.mybatis.controller;

import org.springframework.web.bind.annotation.*;
import top.flobby.boot.mybatis.controller.dto.AjaxResponse;
import top.flobby.boot.mybatis.entity.Clazz;
import top.flobby.boot.mybatis.mapper.ClazzMapper;

import javax.annotation.Resource;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/25
 * @description :
 */

@RestController
@RequestMapping(value = "api/clazz")
public class ClazzController {
    @Resource
    private ClazzMapper clazzMapper;

    @GetMapping("{clazzId}")
    public AjaxResponse getAll(@PathVariable int clazzId){
        Clazz clazz = clazzMapper.getClazzAllInfo(clazzId);
        return AjaxResponse.success(clazz);
    }
}
