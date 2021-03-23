package top.flobby.boot.mybatis.mapper;

import top.flobby.boot.mybatis.entity.Clazz;

/**
 * @author Flobby
 */
public interface ClazzMapper {
    /**
     * delete by primary key
     * @param clazzId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer clazzId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Clazz record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Clazz record);

    /**
     * select by primary key
     * @param clazzId primary key
     * @return object by primary key
     */
    Clazz selectByPrimaryKey(Integer clazzId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Clazz record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Clazz record);
}