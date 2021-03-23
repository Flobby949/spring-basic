package top.flobby.boot.quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/23
 * @description :
 */

@RestController
@RequestMapping("api")
public class HelloController {
    @GetMapping("hello")
    public String hello() {
        return "Hello World";
    }
}
