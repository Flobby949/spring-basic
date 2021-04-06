package top.flobby.boot.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/6
 * @description :启动主类
 */

@SpringBootApplication
@ServletComponentScan
public class SpringBootServletApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootServletApplication.class, args);
    }
}
