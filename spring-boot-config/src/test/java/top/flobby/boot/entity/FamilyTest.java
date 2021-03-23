package top.flobby.boot.entity;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
class FamilyTest {
    @Resource
    private Family family;

    @Test
    void getFamilyName() {
        String familyName = family.getFamilyName();
        log.info(String.valueOf(family));
        assertEquals("happy family", familyName);
    }

    @Test
    void fatherNameTest() {
        String name = family.getFather().getName();
        log.info(name);
        assertEquals("tom", name);
    }

    @Test
    void motherAlias() {
        String alias = family.getMother().getAlias()[0];
        log.info(alias);
        assertEquals("lovely", alias);
    }

    @Test
    void getChild() {
        String name = family.getChild().getName();
        log.info(name);
        assertEquals("jack", name);
    }

    @Test
    void getFriend() {
        String hobby = (String) family.getChild().getFriends().get(0).get("hobby");
        log.info(hobby);
        assertEquals("football", hobby);
    }
}