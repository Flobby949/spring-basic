package top.flobby.boot.mybatis.mapper;

import top.flobby.boot.mybatis.entity.Clazz;

/**
 * @author Flobby
 */
public interface ClazzMapper {
    int deleteByPrimaryKey(Integer clazzId);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    Clazz selectByPrimaryKey(Integer clazzId);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
}