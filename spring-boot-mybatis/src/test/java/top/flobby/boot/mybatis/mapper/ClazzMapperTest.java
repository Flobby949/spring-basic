package top.flobby.boot.mybatis.mapper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import top.flobby.boot.mybatis.entity.Clazz;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class ClazzMapperTest {
    @Resource
    private ClazzMapper clazzMapper;

    @Test
    void getClazzOneToMany() {
        Clazz clazz = clazzMapper.getClazzOneToMany(1);
        System.out.println(clazz.getClazzId() + "," + clazz.getClazzName());
        clazz.getStudents().forEach(student ->
                System.out.println(student.getStudentName() + "," + student.getHometown()));
        assertEquals("软件1911", clazz.getClazzName());
        assertEquals(11, clazz.getStudents().size());
    }

    @Test
    void getClazzAllInfo() {
        Clazz clazz = clazzMapper.getClazzAllInfo(1);
        System.out.println(clazz);
    }
}