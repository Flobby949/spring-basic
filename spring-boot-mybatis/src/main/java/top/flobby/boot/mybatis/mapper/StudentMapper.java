package top.flobby.boot.mybatis.mapper;

import top.flobby.boot.mybatis.entity.Student;

/**
 * @author Flobby
 */
public interface StudentMapper {
    /**
     * delete by primary key
     * @param studentId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer studentId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Student record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Student record);

    /**
     * select by primary key
     * @param studentId primary key
     * @return object by primary key
     */
    Student selectByPrimaryKey(Integer studentId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Student record);
}