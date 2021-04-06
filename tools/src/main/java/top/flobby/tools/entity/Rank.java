package top.flobby.tools.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/2
 * @description :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rank {
    private String stuId;
    private String name;
    private String avatar;
    private String score;
    private String ranking;
}
