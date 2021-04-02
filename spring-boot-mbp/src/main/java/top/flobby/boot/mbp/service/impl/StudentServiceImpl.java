package top.flobby.boot.mbp.service.impl;

import top.flobby.boot.mbp.domain.Student;
import top.flobby.boot.mbp.mapper.StudentMapper;
import top.flobby.boot.mbp.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author flobby
 * @since 2021-04-02
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
