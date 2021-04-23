package top.flobby.tools.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/11
 * @description :热门对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hots {
    private Integer aid;
    private Integer videos;
    private Integer tid;
    private String tname;
    private Integer copyright;
    private String pic;
    private String title;
    private Integer pubdate;
    private Integer ctime;
    private String desc;
    private Integer state;
    private Integer duration;
    private Rights rights;
    private Owner owner;
    private Stat stat;
    private String dynamic;
    private Integer cid;
    private Dimension dimension;
    private String short_link;
    private String bvid;
    private Rcmd_reason rcmd_reason;
}
