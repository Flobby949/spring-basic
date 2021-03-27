package top.flobby.boot.mybatis.mapper;

import top.flobby.boot.mybatis.entity.Clazz;

/**
 * @author Flobby
 */
public interface ClazzMapper {
    /**
     * 查询班级所有学生
     *
     * @param clazzId 班级id
     * @return clazz对象
     */
    Clazz getClazzOneToMany(int clazzId);

    /**
     * 查询班级所有学生和老师
     *
     * @param clazzId 班级id
     * @return clazz对象
     */
    Clazz getClazzAllInfo(int clazzId);
}