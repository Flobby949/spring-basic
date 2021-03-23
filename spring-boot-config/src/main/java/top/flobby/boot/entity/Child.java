package top.flobby.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/9
 * @description :孩子类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class Child {
    private String name;
    private Integer age;
    private List<Map<String, Object>> friends;
}
