package top.flobby.boot.mybatis.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Flobby
 */
@ApiModel(value = "top-flobby-boot-mybatis-entity-Course")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    /**
     * 课程id
     */
    @ApiModelProperty(value = "课程id")
    private Integer courseId;

    /**
     * 课程名称
     */
    @ApiModelProperty(value = "课程名称")
    private String courseName;

    /**
     * 学生列表
     */
    @ApiModelProperty(value = "学生列表")
    private List<Student> students;
}