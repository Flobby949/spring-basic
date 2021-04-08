package top.flobby.boot.exception.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/8
 * @description :
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String name;
}
