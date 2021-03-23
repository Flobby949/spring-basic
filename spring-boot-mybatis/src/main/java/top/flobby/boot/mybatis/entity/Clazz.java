package top.flobby.boot.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Flobby
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Clazz {
    /**
    * 班级id
    */
    private Integer clazzId;

    /**
    * 班级名称
    */
    private String clazzName;

    /**
    * 管理班级教师id
    */
    private Integer teacherId;
}