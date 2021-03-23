package top.flobby.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import top.flobby.boot.config.MixPropertySourceFactory;

import javax.annotation.Resource;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/3/9
 * @description :家庭实体类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Validated
@Component
//@PropertySource(value = {"classpath:family.properties"}, factory = DefaultPropertySourceFactory.class)
@PropertySource(value = {"classpath:family.yml"}, factory = MixPropertySourceFactory.class)
@ConfigurationProperties(prefix = "family")
public class Family {
    @Length(min = 5, max = 20, message = "名称长度必须在5 - 20之间")
    private String familyName;
    @Resource
    private Father father;
    @Resource
    private Mother mother;
    @Resource
    private Child child;
}
