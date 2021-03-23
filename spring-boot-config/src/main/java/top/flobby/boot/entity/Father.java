package top.flobby.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Min;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/9
 * @description :父亲类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class Father {
    private String name;
    @Min(30)
    private Integer age;
}
