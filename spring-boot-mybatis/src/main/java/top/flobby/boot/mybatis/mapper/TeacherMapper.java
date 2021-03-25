package top.flobby.boot.mybatis.mapper;

import top.flobby.boot.mybatis.entity.Teacher;

import java.util.List;

/**
 * @author Flobby
 */
public interface TeacherMapper {
    /**
     * delete by primary key
     * @param teacherId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer teacherId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Teacher record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Teacher record);

    /**
     * select by primary key
     * @param teacherId primary key
     * @return object by primary key
     */
    Teacher selectByPrimaryKey(Integer teacherId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Teacher record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Teacher record);

    /**
     * 获取教师列表
     * @return List
     */
    List<Teacher> selectAll();
}