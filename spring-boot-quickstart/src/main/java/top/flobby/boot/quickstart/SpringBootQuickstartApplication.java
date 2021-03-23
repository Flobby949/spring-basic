package top.flobby.boot.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author Flobby
 */
@SpringBootApplication
@EnableOpenApi
public class SpringBootQuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootQuickstartApplication.class, args);
    }

}
