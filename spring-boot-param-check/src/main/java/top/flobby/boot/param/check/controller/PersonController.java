package top.flobby.boot.param.check.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.flobby.boot.param.check.entity.Person;

import javax.validation.Valid;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/23
 * @description :
 */

@RestController
@Slf4j
@RequestMapping("api/person")
public class PersonController {

    @PostMapping()
    public ResponseEntity<Person> savePerson(
            @RequestBody
            @Valid
            Person person
    ){
        return ResponseEntity.ok().body(person);
    }
}
