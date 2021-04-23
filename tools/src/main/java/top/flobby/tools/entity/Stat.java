package top.flobby.tools.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/11
 * @description :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Stat {
    private Integer aid;
    private Integer view;
    private Integer danmaku;
    private Integer reply;
    private Integer favorite;
    private Integer coin;
    private Integer share;
    private Integer now_rank;
    private Integer his_rank;
    private Integer like;
    private Integer dislike;
}
