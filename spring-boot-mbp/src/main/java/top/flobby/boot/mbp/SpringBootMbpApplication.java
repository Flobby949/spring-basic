package top.flobby.boot.mbp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Flobby
 */
@SpringBootApplication
@MapperScan(basePackages = {"top.flobby.boot.mbp.mapper"})
public class SpringBootMbpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMbpApplication.class, args);
    }

}
