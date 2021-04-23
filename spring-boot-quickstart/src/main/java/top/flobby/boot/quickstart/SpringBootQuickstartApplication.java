package top.flobby.boot.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author Flobby
 */
@SpringBootApplication
@EnableOpenApi
@EnableScheduling
public class SpringBootQuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootQuickstartApplication.class, args);
    }

}
