package top.flobby.boot.mbp.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import top.flobby.boot.mbp.domain.Courses;
import top.flobby.boot.mbp.mapper.CoursesMapper;
import top.flobby.boot.mbp.service.CoursesService;

import javax.annotation.Resource;

/**
 * @author :Flobby
 * @date :2021/3/30
 */
@Service
public class CoursesServiceImpl implements CoursesService {
    @Resource
    private CoursesMapper coursesMapper;

    @Override
    public PageInfo<Courses> findByPage(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页
        PageHelper.startPage(pageNum,pageSize);
        //根据用户id查到所有数据
        Page<Courses> coursesPage = coursesMapper.findAll();
        //将这些作为入参构建出pageInfo(包含了总页数，当前页码，每页数量，当前页list等一堆属性方法)
        return new PageInfo<>(coursesPage);
    }
}