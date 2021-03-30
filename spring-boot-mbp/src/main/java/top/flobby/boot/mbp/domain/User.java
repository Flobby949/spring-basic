package top.flobby.boot.mbp.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Flobby
 */
@ApiModel(value="top-flobby-boot-mbp-domain-User")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_user")
public class User {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private String name;

    @ApiModelProperty(value="")
    private Integer age;

    @ApiModelProperty(value="")
    private String email;
}