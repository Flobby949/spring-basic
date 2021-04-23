package top.flobby.tools.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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
public class MustSee {
    private Integer aid;
    private Integer videos;
    private Integer tid;
    private String tname;
    private Integer copyright;
    private String pic;
    private String title;
    private LocalDateTime pubdate;
    private Integer ctime;
    private String desc;
    private Integer state;
    private Integer duration;
    private Integer mission_id;
    private Rights rights;
    private Owner owner;
    private Stat stat;
    private String dynamic;
    private Integer cid;
    private Dimension dimension;
    private String short_link;
    private String bvid;
    private Integer season_type;
    private String achievement;
}
