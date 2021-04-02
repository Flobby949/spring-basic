package top.flobby.boot.mbp.domain;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Flobby
 */
@ApiModel(value = "top-flobby-boot-mbp-domain-User")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_user")
//@EqualsAndHashCode(callSuper = true)
//@KeySequence(value = "SEQ_USER", clazz = Long.class)
public class User extends Model<User> implements Serializable {
//public class User {
    private static final long serialVersionUID = 6401942840459021558L;
    //    @TableId(type = IdType.INPUT)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @TableLogic
    private Integer deleted;
}