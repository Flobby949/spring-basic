package top.flobby.boot.mbp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.pagehelper.Page;
import top.flobby.boot.mbp.domain.Courses;


/**
 * @author Flobby
 */
public interface CoursesMapper extends BaseMapper<Courses> {
    /**
     * 查询所有记录
     *
     * @return page
     */
    Page<Courses> findAll();
}