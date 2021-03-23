package top.flobby.boot.mybatis.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Flobby
 */
@ApiModel(value="top-flobby-boot-mybatis-entity-Teacher")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    /**
    * 教师id
    */
    @ApiModelProperty(value="教师id")
    private Integer teacherId;

    /**
    * 教师姓名
    */
    @ApiModelProperty(value="教师姓名")
    private String teacherName;

    /**
    * 教师管理班级id
    */
    @ApiModelProperty(value="教师管理班级id")
    private Integer clazzId;
}