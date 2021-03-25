package top.flobby.boot.mybatis.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Flobby
 */
@ApiModel(value="top-flobby-boot-mybatis-entity-Student")
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
     * 学生所属班级的id
     */
    private Integer clazzId;

    /**
     * 学生姓名
     */
    private String studentName;

    /**
     * 学生籍贯
     */
    private String hometown;

    /**
     * 出生日期
     */
    private LocalDate birthday;

}