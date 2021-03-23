package top.flobby.boot.mybatis.mapper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import top.flobby.boot.mybatis.entity.Teacher;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class TeacherMapperTest {
    @Resource
    private TeacherMapper teacherMapper;

    @Test
    void selectAll() {
        List<Teacher> teacherList = teacherMapper.selectAll();
        System.out.println(teacherList);
    }

    @Test
    void findAll() {
        List<Teacher> teacherList = teacherMapper.findAll();
        System.out.println(teacherList);
    }

    @Test
    void insertTeacher(){
        Teacher teacher = Teacher.builder()
                .teacherName("许老师")
                .clazzId(1)
                .build();
        teacherMapper.insertTeacher(teacher);
    }
}