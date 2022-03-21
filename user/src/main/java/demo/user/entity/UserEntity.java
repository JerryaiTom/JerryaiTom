package demo.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("qs_user")
public class UserEntity {
    private Integer id;
    private String  username;
    private String password;
    private Integer roleId;
    private String salt;
    private Date createTime;
    private Date lastTime;

}
