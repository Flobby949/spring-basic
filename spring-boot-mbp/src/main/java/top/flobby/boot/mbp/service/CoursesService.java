package top.flobby.boot.mbp.service;

import com.github.pagehelper.PageInfo;
import top.flobby.boot.mbp.domain.Courses;

/**
 * @author :Flobby
 * @date :2021/3/30
 */
public interface CoursesService {
    /**
     * 查询所有（分页）
     *
     * @param pageNum 页码
     * @param pageSize 每页的数量
     * @return pageInfo
     */
    PageInfo<Courses> findByPage(int pageNum, int pageSize);
}
