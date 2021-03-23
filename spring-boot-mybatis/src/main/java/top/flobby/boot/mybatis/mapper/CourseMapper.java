package top.flobby.boot.mybatis.mapper;

import top.flobby.boot.mybatis.entity.Course;

/**
 * @author Flobby
 */
public interface CourseMapper {
    /**
     * delete by primary key
     * @param courseId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer courseId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Course record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Course record);

    /**
     * select by primary key
     * @param courseId primary key
     * @return object by primary key
     */
    Course selectByPrimaryKey(Integer courseId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Course record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Course record);
}