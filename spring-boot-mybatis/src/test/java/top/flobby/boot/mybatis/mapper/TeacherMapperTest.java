package top.flobby.boot.mybatis.mapper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import top.flobby.boot.mybatis.entity.Teacher;

import javax.annotation.Resource;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class TeacherMapperTest {
    @Resource
    private TeacherMapper teacherMapper;

    @Test
    void getTeacherOneByOne() {
        Teacher teacher = teacherMapper.getTeacherOneByOne(1);
        System.out.println(teacher);
        assertEquals("软件1911", teacher.getClazz().getClazzName());
    }
}