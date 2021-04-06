package top.flobby.boot.servlet.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/6
 * @description :
 */
@RestController
@RequestMapping(value = "api")
@Slf4j
public class TestController {
    @GetMapping("test")
    public String test(HttpServletRequest request, HttpSession session){
        System.out.println("进入接口");

        request.setAttribute("a","a");
        request.setAttribute("a","aaa");
        request.removeAttribute("a");

        session.invalidate();
        return "hello";
    }

    @GetMapping("interceptor")
    public String testInterceptor(@RequestParam("name") String name) {
        log.info("进入接口");
        return name;
    }

    @PostMapping("login")
    public String login(@RequestParam("account") String account, @RequestParam("password") String password) {
        if ("aaa".equals(account) && ("111").equals(password)) {
            log.info("success");
            return "success";
        } else {
            log.info("failure");
            return "failure";
        }
    }
}
