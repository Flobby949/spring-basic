package top.flobby.boot.web.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/4
 * @description :读者实体类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("读者信息")
public class ArticleReader {
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("年龄")
    private Integer age;
}
