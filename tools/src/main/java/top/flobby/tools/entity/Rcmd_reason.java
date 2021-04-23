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
public class Rcmd_reason {
    private String content;
    private Integer corner_mark;
}
