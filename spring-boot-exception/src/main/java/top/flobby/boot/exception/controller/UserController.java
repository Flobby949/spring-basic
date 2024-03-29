package top.flobby.boot.exception.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.flobby.boot.exception.entity.User;
import top.flobby.boot.exception.service.ExceptionService;

import javax.annotation.Resource;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/8
 * @description :
 */

@RestController
@RequestMapping("api/user")
public class UserController {
    @Resource
    private ExceptionService exceptionService;

    @GetMapping("{id}")
    public User getUser(@PathVariable("id") long id) {
        if (id == 0) {
            exceptionService.systemError();
        } else if (id == -1) {
            exceptionService.userError(-1);
        }
        int a = 3 / 0;
        return User.builder().id(id).name("hello").build();
    }
}