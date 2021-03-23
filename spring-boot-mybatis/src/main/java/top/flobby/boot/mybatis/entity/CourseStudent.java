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
@ApiModel(value="top-flobby-boot-mybatis-entity-CourseStudent")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseStudent {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
    * 课程id
    */
    @ApiModelProperty(value="课程id")
    private Integer courseId;

    /**
    * 学生id
    */
    @ApiModelProperty(value="学生id")
    private Integer studentId;
}