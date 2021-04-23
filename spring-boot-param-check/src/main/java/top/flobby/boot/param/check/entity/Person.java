package top.flobby.boot.param.check.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/23
 * @description :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    @NotNull(message = "Id 不能为空")
    private String id;

    @NotNull(message = "name 不能为空")
    private String name;

    @Min(18)
    private Integer age;

    @Pattern(regexp = "^1(3|4|5|8)\\d{9}$", message = "手机号码格式错误")
    @NotBlank(message = "手机号码不能为空")
    private String phone;

    @NotNull(message = "email 不能为空")
    @Email(message = "邮箱格式错误")
    private String email;

    @Pattern(regexp = "((^Man$|^Woman$|^UGM$))", message = "sex 值不在可选范围")
    @NotNull(message = "sex 不能为空")
    private String sex;
}
