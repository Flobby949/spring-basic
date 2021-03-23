package top.flobby.boot.mybatis.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
    @ApiModelProperty(value="学生id")
    private Integer studentId;

    /**
    * 学生姓名
    */
    @ApiModelProperty(value="学生姓名")
    private String studentName;

    /**
    * 学生所属班级id
    */
    @ApiModelProperty(value="学生所属班级id")
    private Integer clazzId;

    /**
    * 学生籍贯
    */
    @ApiModelProperty(value="学生籍贯")
    private String hometown;

    /**
    * 出生日期
    */
    @ApiModelProperty(value="出生日期")
    private Date birthday;

    /**
    * 管理老师id
    */
    @ApiModelProperty(value="管理老师id")
    private Integer teacherId;
}