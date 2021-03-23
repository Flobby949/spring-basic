package top.flobby.boot.jdbc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import top.flobby.boot.jdbc.controller.dto.AjaxResponse;
import top.flobby.boot.jdbc.entity.User;
import top.flobby.boot.jdbc.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/18
 * @description :
 */
@RestController
@RequestMapping(value = "api/users")
@Slf4j
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("all")
    public AjaxResponse getAll(){
        List<User> userList = userService.getAll();
        return AjaxResponse.success(userList);
    }

    @PostMapping()
    public AjaxResponse postUser(@RequestBody User user) {
        boolean flag = userService.postUser(user);
        if (flag) {
            return AjaxResponse.success(user);
        }else {
            return AjaxResponse.failure("添加失败");
        }
    }
}
