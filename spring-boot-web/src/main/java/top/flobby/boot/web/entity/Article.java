package top.flobby.boot.web.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/4
 * @description :图书实体类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@JsonPropertyOrder(value = {"content","title"})
@ApiModel("文章基本信息")
public class Article {

    /**
     * 可以忽略某个字段
     *
     * @JsonIgnore
     */

    @ApiModelProperty("id")
    private Integer id;

    //    @JsonProperty("name")
    @ApiModelProperty("作者")
    private String author;
    @ApiModelProperty("标题")
    private String title;
    @ApiModelProperty("内容")
    private String content;

    @ApiModelProperty("更新时间")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
    @ApiModelProperty("读者列表")
    private List<ArticleReader> readers;
}
