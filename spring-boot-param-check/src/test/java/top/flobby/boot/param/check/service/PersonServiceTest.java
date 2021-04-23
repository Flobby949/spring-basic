package top.flobby.boot.param.check.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import top.flobby.boot.param.check.entity.Person;

import javax.annotation.Resource;
import javax.validation.ConstraintViolationException;

@SpringBootTest
@Slf4j
class PersonServiceTest {
    @Resource
    private PersonService personService;

    @Test
    @ExceptionHandler(ConstraintViolationException.class)
    void valid() {
        Person person = Person.builder()
                .id("123")
                .name("adf")
                .age(11)
                .phone("12962521753")
                .email("2541226493qq.com")
                .sex("男")
                .build();
        personService.valid(person);
    }
}