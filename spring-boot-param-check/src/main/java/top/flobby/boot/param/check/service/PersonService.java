package top.flobby.boot.param.check.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import top.flobby.boot.param.check.entity.Person;

import javax.validation.Valid;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/23
 * @description :
 */
@Service
@Slf4j
@Validated
public class PersonService {
    public void valid(@Valid Person person){
        log.info("service方法验证");
    }
}
