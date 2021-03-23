package top.flobby.boot.web.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/4
 * @description :统一对象
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Param {
    private Integer id;
    private String title;
}
