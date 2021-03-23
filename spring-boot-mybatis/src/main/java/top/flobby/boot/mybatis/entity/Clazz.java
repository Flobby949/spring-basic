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
@ApiModel(value="top-flobby-boot-mybatis-entity-Clazz")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Clazz {
    /**
    * 班级id
    */
    @ApiModelProperty(value="班级id")
    private Integer clazzId;

    /**
    * 班级名称
    */
    @ApiModelProperty(value="班级名称")
    private String clazzName;

    /**
    * 管理班级教师id
    */
    @ApiModelProperty(value="管理班级教师id")
    private Integer teacherId;
}