package top.flobby.tools.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author Flobby
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Rank {
    /**
    * 视频主键
    */
    private Integer id;

    /**
    * up主id
    */
    private Integer userId;

    /**
    * 播放量
    */
    private Integer view;

    /**
    * 弹幕数量
    */
    private Integer danmaku;

    /**
    * 收藏数量
    */
    private Integer favorites;

    /**
    * 投币数量
    */
    private Integer coins;

    /**
    * 转发数量
    */
    private Integer share;

    /**
    * 点赞数量
    */
    private Integer like;

    /**
    * 视频总时长
    */
    private Integer duration;

    /**
    * 发布时间
    */
    private LocalDateTime pubdate;

    /**
    * 视频标题
    */
    private String title;

    /**
    * 视频分区
    */
    private Integer type;

    /**
    * 视频封面
    */
    private String pic;

    /**
    * 综合评分
    */
    private Integer score;
}
