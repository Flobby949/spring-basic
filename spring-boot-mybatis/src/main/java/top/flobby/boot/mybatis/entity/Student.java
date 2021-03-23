package top.flobby.boot.mybatis.entity;

import java.util.Date;
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
public class Student {
    /**
    * 学生id
    */
    private Integer studentId;

    /**
    * 学生姓名
    */
    private String studentName;

    /**
    * 学生所属班级id
    */
    private Integer clazzId;

    /**
    * 学生籍贯
    */
    private String hometown;

    /**
    * 出生日期
    */
    private Date birthday;

    /**
    * 管理老师id
    */
    private Integer teacherId;
}